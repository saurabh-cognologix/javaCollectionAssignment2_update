package corejava.collection.assignmentset2.question6;

import corejava.collection.assignmentset2.question6.model.Constituency;
import corejava.collection.assignmentset2.question6.parser.ConstituencyParser;
import corejava.collection.assignmentset2.question6.solution.CandidateIdCalculator;
import corejava.collection.assignmentset2.question6.solution.CandidateIdCalculatorUsingStream;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "JavaTraining/src/corejava/collection/assignmentset2/question6/input/input.csv";
        ConstituencyParser constituencyParser = new ConstituencyParser();
        List<Constituency> constituencyData = constituencyParser.parseCSVFile(filePath);

        CandidateIdCalculator candidateIdCalculator = new CandidateIdCalculator();
        Map<String,Long> map = candidateIdCalculator.storeMaximumVotes(constituencyData);
        List<Integer> id = candidateIdCalculator.getIdOfMaxVotes(constituencyData,map);

        System.out.println(id);
        CandidateIdCalculatorUsingStream candidateIdCalculatorUsingStream = new CandidateIdCalculatorUsingStream();
        Map<String,Integer> streamMap =candidateIdCalculatorUsingStream.getIdOfCandidate(constituencyData);
        System.out.println("--------------Using Stream-------------------");
        streamMap.forEach((k,v)-> System.out.println(k+" :  "+v));
    }
}
