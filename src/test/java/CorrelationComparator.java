import java.util.Comparator;

public class CorrelationComparator {
    public static Comparator<LongTaskStatus> getCorrelationComparator(){
        return new NewCorrelationComparator();
    }

    static class NewCorrelationComparator implements Comparator<LongTaskStatus>{
        @Override
        public int compare(LongTaskStatus o1, LongTaskStatus o2) {
            Message o1Name = o1.getName();
            Message o2Name = o2.getName();
            if(o1Name == o2Name)
                return 1;

            if (o1Name == null || o1Name.getKey() == null) {
                return 1;  // push o1 to bottom
            }

            if (o2Name == null || o2Name.getKey() == null)
                return -1;  // push o2 to bottom

            if(o1Name.getKey() == o2Name.getKey())
                return 1;

            return o1Name.getKey().compareTo(o2Name.getKey());
        }
    }
}
