package ComparatorImplementation;

import java.util.Comparator;

public class InvestorComparator implements Comparator<Investor> {
    @Override
    public int compare(Investor o1, Investor o2) {
        if(o1.getInvestorAge() != o2.getInvestorAge()){
//            return o1.getInvestorAge()
}
        return o1.getInvestorId().compareTo(o2.getInvestorId());
    }
}
