package Immutability;

import java.util.Date;

public class Investor {
    private final String investorName;
    private final int investorId;
    private final Date joinDate;


    public Investor(String investorName, int investorId, Date joinDate) {
        this.investorName = investorName;
        this.investorId = investorId;
        this.joinDate = new Date(joinDate.getTime());
//        this.joinDate = joinDate;
    }

    public String getInvestorName() {
        return investorName;
    }

    public int getInvestorId() {
        return investorId;
    }

    public Date getJoinDate() {
        return new Date(joinDate.getTime());
    }

    @Override
    public String toString() {
        return "Investor{" +
                "investorName='" + investorName + '\'' +
                ", investorId=" + investorId +
                ", joinDate=" + joinDate +
                '}';
    }
}
