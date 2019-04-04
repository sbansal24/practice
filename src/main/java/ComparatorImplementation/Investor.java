package ComparatorImplementation;

public class Investor {
    private String investorId;
    private String investorName;
    private int investorAge;

    public Investor(String investorId, String investorName, int investorAge) {
        this.investorId = investorId;
        this.investorName = investorName;
        this.investorAge = investorAge;
    }

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public int getInvestorAge() {
        return investorAge;
    }

    public void setInvestorAge(int investorAge) {
        this.investorAge = investorAge;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "investorId='" + investorId + '\'' +
                ", investorName='" + investorName + '\'' +
                ", investorAge=" + investorAge +
                '}';
    }
}
