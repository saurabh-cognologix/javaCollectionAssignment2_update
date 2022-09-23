package corejava.collection.assignmentset2.question8.solution;

import java.util.Arrays;

public class Isogram {
    public  boolean checkIsogram(String str){
        boolean flag = true;
        str = str.toLowerCase();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<str.length()-1;i++){
            if(arr[i+1] == arr[i]){
                flag = false;
            }
        }
        return flag;
    }
}
