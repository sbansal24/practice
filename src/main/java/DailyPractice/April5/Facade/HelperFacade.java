package DailyPractice.April5.Facade;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReports(DBTypes dbTypes, ReportTypes reportTypes, String tableName) {
        Connection connection;
        switch (dbTypes) {
            case MYSQL:
                connection = MySqlHelper.getMySqlDbConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportTypes) {
                    case PDF:
                        mySqlHelper.generateMySqlPdfReport(tableName, connection);
                        break;
                    case CSV:
                        mySqlHelper.generateMysqlCsvReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleDbConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportTypes) {
                    case PDF:
                        oracleHelper.generateOraclePdfReport(tableName, connection);
                        break;
                    case CSV:
                        oracleHelper.generateOracleCsvReport(tableName, connection);
                        break;
                }
                break;
        }
    }
}
