package corejava.collection.assignmentset2.question3.solution;

import corejava.collection.assignmentset2.question3.model.Library;

import java.util.*;


public class FetchOutDatedVersion {
/*
     Stored the higest version of each libray in a HashMap i.e. tempMap
     library name : key
     higherVersion : value
*/
    public Map<String,Integer> getHighestVersion(List<Library> libraryList){
        Map<String, Integer> tempMap = new HashMap<>();
        Integer higherVersion = 0;
        for(Library st : libraryList){
            String libraryName = st.getLibraryName().trim();
            Integer currentVersionName = st.getVersion();
           // tempMap.put(libraryName,higherVersion);
            if(tempMap.containsKey(libraryName.trim()) && tempMap.get(libraryName)<currentVersionName) {
                higherVersion = currentVersionName;
                tempMap.put(libraryName,higherVersion);
            }
            else if(!tempMap.containsKey(libraryName.trim())){
                    tempMap.put(libraryName,currentVersionName);
            }
        }
       // tempMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
        return tempMap;

    }

    /*
         Adding the outdated version in a Hashset
     */
    public Set<String> getOutDatedVersion(List<Library> libraryList, Map<String,Integer> tempMap){
        Set<String> outDatedVersionSet = new HashSet<>();
        for(Library ll : libraryList){
            String libraryName = ll.getLibraryName().trim();
            Integer currentVersionName = ll.getVersion();
            String productName = ll.getProductName().trim();
            if(tempMap.containsKey(libraryName) && currentVersionName<tempMap.get(libraryName)){
                outDatedVersionSet.add(productName);
            }
        }

        //outDatedVersionSet.forEach((n)-> System.out.println("Listtttt  : "+n));
        return outDatedVersionSet;
    }
}
