package DailyPractice.April5.Facade;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlDbConnection(){
        return  null;
    }

    public void generateMySqlPdfReport(String tableName, Connection connection){
        System.out.println("generating mysql pdf report");
    }

    public void generateMysqlCsvReport(String tableName, Connection connection){
        System.out.println("generating mysql csv report");
    }
}
