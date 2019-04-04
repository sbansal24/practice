package DailyPractice.March26;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestClass {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfYear());
        LocalDate localDate = LocalDate.now();

    }
}
