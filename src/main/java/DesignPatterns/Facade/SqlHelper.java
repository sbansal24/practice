package DesignPatterns.Facade;

import java.sql.Connection;

public class SqlHelper {
    public static Connection getMySqlConnection(){
        return null;
    }

    public void generatePdfReport(Connection connection, String tableName){
        System.out.println("mysql is generating pdf report");
    }

    public void generateExcelReport(Connection connection, String tableName){
        System.out.println("mysql is generating excel report");
    }
}
