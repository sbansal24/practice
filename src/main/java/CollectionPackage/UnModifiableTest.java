package CollectionPackage;

import ComparatorImplementation.Investor;

import java.util.*;

public class UnModifiableTest {
    public static void main(String[] args) {
        Investor investor = new Investor("i1", "investor1",25);
        Investor investor2 = new Investor("i2", "investor2", 30);
        ArrayList<Investor> list = new ArrayList<>();
        list.add(investor);
        list.add(investor2);
        System.out.println(list.indexOf(investor2));
        UnModifiableTest test = new UnModifiableTest();
        test.checkImmutability(Collections.unmodifiableList(list));
        list.forEach(System.out::println);
//        list.removeIf(investor1 -> investor.getInvestorAge()>30);
//        Collections.sort(list, Comparator.comparing(Investor::getInvestorAge));

        Iterator<Investor> itr = list.iterator();
//        while(itr.hasNext()){
//
//        }

//        Iterable<Investor> itr1 = list.iterator();
    }

    private void checkImmutability(List<Investor> list){
//        List<Investor> list1 = new ArrayList<>(list);
//        list.get(0).setInvestorAge(30);
        list = new ArrayList<>();
        list.add(new Investor("i3", "investor2", 30));
    }
}
