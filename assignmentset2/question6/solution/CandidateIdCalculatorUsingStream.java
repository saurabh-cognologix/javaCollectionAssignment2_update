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
/*
*   maxBy() :
*1)  methods return a BinaryOperator which returns the greater of the two elements based on a given comparator
*2) Parameter:  It takes in only one parameter namely, comparator which is an object of the Comparator class.
*
* Binary Operator:
* It represents a binary operator which takes two operands and operates on them to produce a result.
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
