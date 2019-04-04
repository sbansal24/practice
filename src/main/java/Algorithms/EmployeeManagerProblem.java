package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagerProblem {
    private static Map<String, Integer> result = new HashMap<>();

    public static void main(String[] args) {
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("A", "C");
        dataSet.put("B", "C");
        dataSet.put("C", "F");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("F", "F");
        calculateManagerEmployeeMap(dataSet);
        System.out.println(result);
    }

    private static void calculateManagerEmployeeMap(Map<String, String> dataSet) {
        HashMap<String, List<String>> mngrEmpMap = new HashMap<>();

        for (Map.Entry<String, String> entry : dataSet.entrySet()) {
            String emp = entry.getKey();
            String mngr = entry.getValue();
            if (!emp.equals(mngr)) {
                List<String> directReportees = mngrEmpMap.get(mngr);
                if (directReportees == null) {
                    directReportees = new ArrayList<>();
                }
                directReportees.add(emp);
                mngrEmpMap.put(mngr, directReportees);
            }
        }
        System.out.println(mngrEmpMap);
        for (String mngr : dataSet.keySet())
            calculatemngrEmployeeMap(mngr, mngrEmpMap);
    }

    private static int calculatemngrEmployeeMap(String mngr, HashMap<String, List<String>> mngrEmpMap) {
        int count;
        if (!mngrEmpMap.containsKey(mngr)) {
            result.put(mngr, 0);
            return 0;
        } else if (result.containsKey(mngr)) {
            count = result.get(mngr);
        } else {
            List<String> reportees = mngrEmpMap.get(mngr);
            count = reportees.size();
            for (String reportee : reportees) {
                count += calculatemngrEmployeeMap(reportee, mngrEmpMap);
                result.put(mngr, count);
            }
        }
        return count;
    }
}
