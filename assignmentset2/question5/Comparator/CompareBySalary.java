package corejava.collection.assignmentset2.question5.Comparator;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Long> {
    @Override
    public int compare(Long l1, Long l2) {
        return l1.compareTo(l2);
    }
}
