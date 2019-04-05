package DailyPractice.April5.Facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDbConnection(){
        return  null;
    }

    public void generateOraclePdfReport(String tableName, Connection connection){
        System.out.println("generating Oracle pdf report");
    }

    public void generateOracleCsvReport(String tableName, Connection connection){
        System.out.println("generating Oracle csv report");
    }
}
