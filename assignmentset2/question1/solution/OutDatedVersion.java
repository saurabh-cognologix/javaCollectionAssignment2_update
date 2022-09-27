package corejava.collection.assignmentset2.question1.solution;

import corejava.collection.assignmentset2.question1.model.Server;

import java.util.*;

public class OutDatedVersion {
    public Map<String,Double> storedHighestVersion(List<Server> serverList){
        Map<String,Double> tempMap = new HashMap<>();
        Double highestVersion = 0.0;
        for(Server server: serverList){
            String serverName = server.getServerName();
            String typesOfSoftware = server.getTypesOfSoftware();
            String applicationName = server.getApplicationName();
            Double version = server.getVersion();
            if(tempMap.containsKey(applicationName) &&tempMap.get(applicationName)>highestVersion){
                highestVersion =version;
                tempMap.put(applicationName,highestVersion);
            }else if(!tempMap.containsKey(applicationName)){
                tempMap.put(applicationName,version);
            }
        }
//        System.out.println("Inside OutDated Version Class");
//        tempMap.forEach((k,v)-> System.out.println(k+ "  " +v));
        return tempMap;

    }



    public Set<String> getOutDatatedVersionPakcageName(Map<String,Double> versionMap,List<Server> serverList){
        List<String> packageListName = new ArrayList<>();
        Set<String> outdatedPackageNameSet = new HashSet<>();
        Set<String> packageNameSet = new HashSet<>();
        for(Server server : serverList){
            String applicationName = server.getApplicationName();
            Double version = server.getVersion();
            //System.out.println(applicationName);
            if(versionMap.containsKey(applicationName) && versionMap.containsValue(version)){
                packageListName.add(applicationName);
            }
        }
//        packageListName.forEach(System.out::println);
//        System.out.println("*********************");
        for (String packageName : packageListName) {
            if (!packageNameSet.add(packageName)) {
                outdatedPackageNameSet.add(packageName);
            }
        }
        //outdatedPackageNameSet.forEach(System.out::println);
        return outdatedPackageNameSet;
    }
}
