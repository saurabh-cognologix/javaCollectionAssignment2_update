package corejava.collection.assignmentset2.question7;
import corejava.collection.assignmentset2.question7.solution.ComparingList;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(4,5,10,25,35,15);
        List<Integer> list2 = List.of(4,5,10,25,35,15);
        ComparingList comparingList = new ComparingList();
        String result = comparingList.getComparedList(list1,list2);
        System.out.println(result);
    }
}
