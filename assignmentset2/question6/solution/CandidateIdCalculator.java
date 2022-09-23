package corejava.collection.assignmentset2.question6.solution;
import corejava.collection.assignmentset2.question6.model.Constituency;

import javax.security.auth.login.LoginContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class CandidateIdCalculator {
    public Map<String,Long> storeMaximumVotes(List<Constituency> votesList){
        Map<String,Long> tempMap = new HashMap<>();
        Long higherVotes = Long.valueOf(0);
        for(Constituency constituency : votesList){
            Integer candidateId = constituency.getCandidateId();
            String candidateName = constituency.getCandidateName();
            String constituencyName = constituency.getConstituencyName();
            Long totalVotes = constituency.getVotes();
            if(tempMap.containsKey(constituencyName) && tempMap.get(constituencyName)<totalVotes){
                higherVotes = totalVotes;
                tempMap.put(constituencyName,higherVotes);
            }else if(!tempMap.containsKey(constituencyName)){
                tempMap.put(constituencyName,totalVotes);
            }
        }
        //tempMap.forEach((k,v)-> System.out.println(k+"  "+v));
        return tempMap;
    }

    public List<Integer> getIdOfMaxVotes(List<Constituency> votesList,Map<String,Long> tempMap){
        List<Integer> idList = new ArrayList<>();

        for(Constituency constituency : votesList){
            Integer candidateId = constituency.getCandidateId();
            String constituencyName = constituency.getConstituencyName();
            Long totalVotes = constituency.getVotes();
            if(tempMap.containsKey(constituencyName) && tempMap.get(constituencyName)==totalVotes){
                idList.add(candidateId);
            }
        }
        //idList.forEach(System.out::println);
        return idList;
    }
}
