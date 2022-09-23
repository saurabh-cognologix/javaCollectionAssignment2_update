package corejava.collection.assignmentset2.question6.mapper;

import corejava.collection.assignmentset2.question6.model.Constituency;

public class ConstituencyMapper {
    public static Constituency map(String data){
        String[] arr = data.split(",");
        Integer candidateId = Integer.parseInt(arr[0].trim());
        String candidateName = arr[1].trim();
        String constituencyName = arr[2].trim();
        Long votes = Long.parseLong(arr[3].trim());
        Constituency constituency = new Constituency(candidateId,candidateName,constituencyName,votes);
        return constituency;
    }
}
