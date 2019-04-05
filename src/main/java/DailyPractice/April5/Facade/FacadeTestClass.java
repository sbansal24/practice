package DailyPractice.April5.Facade;

//facade pattern helps the client application to easily interact with the system
public class FacadeTestClass {
    public static void main(String[] args) {
        String tableName = "investors";
        HelperFacade.generateReports(DBTypes.MYSQL, ReportTypes.PDF, tableName);

        HelperFacade.generateReports(DBTypes.ORACLE, ReportTypes.CSV, tableName);

    }
}
