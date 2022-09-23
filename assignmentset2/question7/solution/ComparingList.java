package corejava.collection.assignmentset2.question7.solution;

import java.util.List;

public class ComparingList {
    public String getComparedList(List<Integer> l1, List<Integer> l2){
        final int sizeOfList1 = l1.size();
        final int sizeOfList2 = l2.size();
        String s = null;
        if(l1.containsAll(l2) && sizeOfList1 == sizeOfList2){
            // System.out.println("list are equal");
            s= "list are equal";
        }else if(l1.containsAll(l2)){
            // System.out.println("list 2 is subset of list 1");
            s="list 2 is subset of list 1";
        }else if(l2.containsAll(l1)){
            //System.out.println("list 1 is subset of list 2");
            s="list 1 is subset of list 2";
        }else{
            // System.out.println("Not subset");
            s="Not subset";
        }
        return s;
    }
}
