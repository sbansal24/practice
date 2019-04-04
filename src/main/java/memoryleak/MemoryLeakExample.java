package memoryleak;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeakExample {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        int i = 1;
        Employee employee= new Employee(i, "abc"+i);
//        while(true){
            map.put(employee, "xyz"+i);
            i++;
            employee = new Employee(i, "abc"+i);
//        }
        System.out.println(map.get(employee));
    }
}
