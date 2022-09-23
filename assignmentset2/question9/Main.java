package corejava.collection.assignmentset2.question9;

import corejava.collection.assignmentset2.question9.solution.Anagram;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> list = List.of("enlists","google","inlets","banana");
        String st = "listen";
        Anagram anagram = new Anagram();
        String result = anagram.checkAnagram(list,st);
        System.out.println(result);
    }
}
