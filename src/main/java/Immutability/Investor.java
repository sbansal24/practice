package Immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Investor {
    private final String investorName;
    private final int investorId;
    private final Date joinDate;
    private final List<Integer> list;




    public Investor(String investorName, int investorId, Date joinDate, List<Integer> list) {
        this.investorName = investorName;
        this.investorId = investorId;
        this.joinDate = new Date(joinDate.getTime());
        this.list = list;
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

    public List<Integer> getList() {
//        return Collections.unmodifiableList(list);
        return new ArrayList<>(list);
    }


    @Override
    public String toString() {
        return "Investor{" +
                "investorName='" + investorName + '\'' +
                ", investorId=" + investorId +
                ", joinDate=" + joinDate +
                ", list=" + list +
                '}';
    }
}
