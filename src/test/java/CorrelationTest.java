import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CorrelationTest {
    @Test
    public void foo() {
        System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
        List<LongTaskStatus> list = new ArrayList<>();
        for (int i = 1; i <=32; i++) { // at least 32 items are needed to trigger the appropriate code path!
            LongTaskStatus n = i % 2 == 0 ? new LongTaskStatus(null) : new LongTaskStatus(new Message("somelabel"+i));
            list.add(n);
        }
        sort(list);
        Assert.assertTrue(true);
    }

    private void sort(List<LongTaskStatus> fullList) {
        Collections.sort(fullList, CorrelationComparator.getCorrelationComparator());
    }


}
