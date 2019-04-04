package DailyPractice.March11;

import java.util.Objects;

public class Investor implements Comparable<Investor> {
    private final int investorId;
    private final String investorName;

    public Investor(int investorId, String investorName) {
        this.investorId = investorId;
        this.investorName = investorName;
    }

    public int getInvestorId() {
        return investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Investor investor = (Investor) o;
//        return investorId == investor.investorId &&
//                Objects.equals(investorName, investor.investorName);
//    }
//
//    @Override
//    public int hashCode() {
////        System.out.println(Objects.hash(investorId, investorName));
//        return Objects.hash(investorId, investorName);
//    }

    @Override
    public int compareTo(Investor o) {
        return this.investorId - o.investorId;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "investorId=" + investorId +
                ", investorName='" + investorName + '\'' +
                '}';
    }
}
