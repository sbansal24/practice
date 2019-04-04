package ComparatorImplementation;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {

        Investor investor1 = new Investor("i1", "investor1",25);
        Investor investor2 = new Investor("i2", "investor2",35);
        Investor investor3 = new Investor("i3", "investor3",30);
        Investor investor4 = new Investor("i4", "investor4",22);
        Investor investor5 = new Investor("i5", "investor5",25);

        List<Investor> investorList = Arrays.asList(investor1, investor2, investor3, investor4, investor5);

        Collections.sort(investorList, new InvestorComparator());

        Collections.sort(investorList, new Comparator<Investor>() {
            @Override
            public int compare(Investor o1, Investor o2) {
                return o1.getInvestorName().compareTo(o2.getInvestorName());
            }
        });

        Collections.sort(investorList, (o1, o2) -> o1.getInvestorName().compareTo(o2.getInvestorName()));
        Collections.sort(investorList, Comparator.comparing(Investor::getInvestorName).thenComparing(Investor::getInvestorAge));
        Collections.sort(investorList, Comparator.comparing(Investor::getInvestorName).reversed());

        TreeSet<Investor> set = new TreeSet<>();
        set.add(investor1);
    }

    public <T extends  Number> T test(T t){
        return t;
    }
}
