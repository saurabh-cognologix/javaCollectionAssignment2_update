package corejava.collection.assignmentset2.question3.mapper;

import corejava.collection.assignmentset2.question3.model.Library;

public class LibraryMapper {
    public static Library map(String data){
        String[] arr = data.split(",");
        String productName = arr[0].trim();
        String libraryName = arr[1].trim();
        Integer version = Integer.parseInt(arr[2].trim());
        Library library = new Library(productName,libraryName,version);
        return library;
    }
}
