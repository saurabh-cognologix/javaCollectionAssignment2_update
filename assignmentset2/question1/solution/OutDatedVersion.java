package corejava.collection.assignmentset2.question1.solution;

import corejava.collection.assignmentset2.question1.model.Server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutDatedVersion {
    public Map<String,Double> storedHighestVersion(List<Server> serverList){
        Map<String,Double> tempMap = new HashMap<>();
        Double highestVersion = 0.0;
        for(Server server: serverList){
            String serverName = server.getServerName();
            String typesOfSoftware = server.getTypesOfSoftware();
            String applicationName = server.getApplicationName();
            Double version = server.getVersion();
            if(tempMap.containsKey(applicationName) &&tempMap.get(applicationName)<highestVersion){
                highestVersion =version;
                tempMap.put(applicationName,highestVersion);
            }else if(!tempMap.containsKey(applicationName)){
                tempMap.put(applicationName,version);
            }
        }
       // tempMap.forEach((k,v)-> System.out.println(k+ "  " +v));
        return tempMap;

    }

//    public List<String> getHighestVersion(List<Server> serverList,Map<String,Double> highestMap){
//        List<String>
//    }
}
