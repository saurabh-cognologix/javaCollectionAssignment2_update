package corejava.collection.assignmentset2.question8;

import corejava.collection.assignmentset2.question8.solution.Isogram;

public class Main {
    public static void main(String[] args) {
        String str = "Abcdef";
        Isogram isogram = new Isogram();
        boolean result = isogram.checkIsogram(str);
        System.out.println(result);
    }
}
