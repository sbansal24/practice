package DesignPatterns.Facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleConnection(){
        return null;
    }

    public void generatePdfReport(Connection connection, String tableName){
        System.out.println("oracle is generating pdf report");
    }

    public void generateExcelReport(Connection connection, String tableName){
        System.out.println("oracle is generating excel report");
    }
}
