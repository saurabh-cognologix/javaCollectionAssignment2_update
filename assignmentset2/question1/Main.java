package corejava.collection.assignmentset2.question1;

import corejava.collection.assignmentset2.question1.model.Server;
import corejava.collection.assignmentset2.question1.parser.ServerDetailsParser;
import corejava.collection.assignmentset2.question1.solution.OutDatedVersion;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "JavaTraining/src/corejava/collection/assignmentset2/question1/input/input.csv";
        ServerDetailsParser serverDetailsParser = new ServerDetailsParser();
        List<Server> serverList = serverDetailsParser.parseCSVFile(filePath);
        //serverList.forEach(System.out::println);

        OutDatedVersion outDatedVersion = new OutDatedVersion();
        Map<String,Double> map = outDatedVersion.storedHighestVersion(serverList);
        map.forEach((k,v)-> System.out.println(k+ " : "+v));
    }
}
