package corejava.collection.assignmentset2.question3;


import corejava.collection.assignmentset2.question3.model.Library;
import corejava.collection.assignmentset2.question3.parser.LibraryInputParser;
import corejava.collection.assignmentset2.question3.solution.FetchOutDatedVersion;
import corejava.collection.assignmentset2.question3.solution.FetchOutDatedVersionUsingStream;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String filePath = "JavaTraining/src/corejava/collection/assignmentset2/question3/input/input.txt";
        LibraryInputParser libraryInputParser = new LibraryInputParser();
        List<Library> llist = libraryInputParser.parseTextFile(filePath);
       // System.out.println(llist);

        FetchOutDatedVersion fetchOutDatedVersion = new FetchOutDatedVersion();
        Map<String,Integer> map = fetchOutDatedVersion.getHighestVersion(llist);

         Set<String> outDatedVersionSet = fetchOutDatedVersion.getOutDatedVersion(llist,map);
        outDatedVersionSet.forEach(System.out::println);

        System.out.println("------------Using Stream --------------------");
        FetchOutDatedVersionUsingStream fetchOutDatedVersionUsingStream =new FetchOutDatedVersionUsingStream();
        Map<String,Integer> tempMap = fetchOutDatedVersionUsingStream.getHighestVersionStream(llist);
        Set<String> outDatedVersionSetStream = fetchOutDatedVersionUsingStream.getOutDatedVersionStream(llist,tempMap);
        outDatedVersionSetStream.forEach(System.out::println);
    }
}
