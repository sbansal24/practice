package DesignPatterns.Singleton;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
        if(singleton!=null){
            throw new RuntimeException();
        }

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
