package DesignPatterns.Facade;

import java.sql.Connection;

public class FacadeHelper {
    public static void generateReport(DbType dbType, ReportType reportType, String tableName) {
        Connection connection = null;
        switch (dbType) {
            case MYSQL:
                connection = SqlHelper.getMySqlConnection();
                SqlHelper sqlHelper = new SqlHelper();
                switch (reportType) {
                    case PDF:
                        sqlHelper.generatePdfReport(connection, tableName);
                        break;
                    case EXCEL:
                        sqlHelper.generateExcelReport(connection, tableName);
                        break;
                    default:
                        throw new RuntimeException();
                }
        }
    }
}
