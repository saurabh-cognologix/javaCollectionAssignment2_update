package corejava.collection.assignmentset2.question6.solution;

import corejava.collection.assignmentset2.question6.model.Constituency;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CandidateIdCalculatorUsingStream {
    public Map<String,Integer> getIdOfCandidate(List<Constituency > votesList){
        Map<Integer, Long> candidateVotes = votesList.stream()
                .collect(Collectors.toMap(
                        Constituency::getCandidateId,
                        Constituency::getVotes
                ));
//        System.out.println("Id and their Votes: ");
//        candidateVotes.forEach((k,v)-> System.out.println(k+" : "+v));
        /*
        *
        * */
        Map<String,Integer> map = votesList.stream()
                        .collect(Collectors.toMap(
                                Constituency::getConstituencyName,
                                Constituency::getCandidateId,
                                BinaryOperator.maxBy(Comparator.comparing(candidateVotes::get))
                        ));

       // map.forEach((k,v)-> System.out.println(k+" : "+v));
        return map;

    }
}
