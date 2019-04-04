package DesignPatterns.Facade;

import java.sql.Connection;

public class FacadeTest {
    public static void main(String[] args) {
        //without facade test
        String tableName = "testTable";
        Connection connection = SqlHelper.getMySqlConnection();
        SqlHelper sqlHelper = new SqlHelper();
        sqlHelper.generateExcelReport(connection, tableName);

        FacadeHelper.generateReport(DbType.MYSQL, ReportType.PDF, tableName);
    }
}
