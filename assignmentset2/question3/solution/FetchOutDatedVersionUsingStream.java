package corejava.collection.assignmentset2.question3.solution;

import corejava.collection.assignmentset2.question3.model.Library;

import java.util.*;
import java.util.stream.Collectors;

public class FetchOutDatedVersionUsingStream {
    public Map<String, Integer> getHighestVersionStream(List<Library> libraryList) {
        // tempMap.forEach((k,v)-> System.out.println(k+" : "+v));
        return libraryList.stream()
                .collect(Collectors.groupingBy(
                        Library::getLibraryName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Library::getVersion)),
                                e -> e.map(Library::getVersion).orElse(-1)
                        )
                ));
    }

    public Set<String> getOutDatedVersionStream(List<Library> libraryList, Map<String, Integer> tempMap) {
        return libraryList.stream()
                .filter(
                        e -> tempMap.containsKey(e.getLibraryName()) && e.getVersion() < tempMap.get(e.getLibraryName())
                )
                .map(Library::getProductName)
                .collect(Collectors.toSet());
    }

}
