package lruCache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LruCacheImpl<K, V> {
    private ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();
    private ConcurrentLinkedQueue<K> queue = new ConcurrentLinkedQueue<>();
    private final int MAX_SIZE;
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = readWriteLock.readLock();
    private Lock writeLock = readWriteLock.writeLock();

    public LruCacheImpl(final int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
    }

    public V getElement(K key) {
        readLock.lock();
        try {
            V value = null;
            if (map.containsKey(key)) {
                queue.remove(key);
                value = map.get(key);
                queue.add(key);
            }
            return value;
        } finally {
            readLock.unlock();
        }
    }

    public V removeElement(K key) {
        writeLock.lock();
        try {
            V value = null;
            if (map.containsKey(key)) {
                value = map.remove(key);
                queue.remove();
            }
            return value;
        } finally {
            writeLock.unlock();
        }
    }

    public void addElement(K key, V value) {
        writeLock.lock();
        try {
            if (map.containsKey(key)) {
                queue.remove(key);
            }
            while (queue.size() >= MAX_SIZE) {
                K poll = queue.poll();
                map.remove(poll);
            }
            map.put(key, value);
            queue.add(key);
        } finally {
            writeLock.unlock();
        }
    }
}
