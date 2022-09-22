package corejava.collection.assignmentset2.question3.parser;

import corejava.collection.assignmentset2.question3.mapper.LibraryMapper;
import corejava.collection.assignmentset2.question3.model.Library;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryInputParser {
    public List<Library> parseTextFile(String filePath) {
        List<Library> list = new ArrayList<>();
        BufferedReader br = null;
        String st;
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine())!=null){
                Library library = LibraryMapper.map(st);
                list.add(library);
            }
        }catch (Exception exception){
            throw new RuntimeException(exception);
        } finally {
            if(br!= null){
                try {
                    br.close();
                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        }
        return list;
    }
}
