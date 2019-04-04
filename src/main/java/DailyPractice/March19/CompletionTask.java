package DailyPractice.March19;

import java.util.concurrent.Callable;

public class CompletionTask implements Callable<Integer> {
    private final String name;

    public CompletionTask(String name) {
        this.name = name;
    }


    @Override
    public Integer call() {
        int number = (int) Math.random() * 200000 + 10;
        System.out.println(name +" is producing "+number);
        return number;
    }
}
