package MultiThreading.NThreadsAlternatePrinting;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadAlternateTest {
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(0);
        List<Thread> threads = Stream.generate(()-> new Thread(new PrintAlternate(5, number)))
                .limit(5).collect(Collectors.toList());
        threads.forEach(Thread::start);
    }
}
