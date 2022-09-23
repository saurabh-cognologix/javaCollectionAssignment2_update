package corejava.collection.assignmentset2.question9.solution;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public String checkAnagram(List<String> list,String  st){
        String str = null;
        st = st.toLowerCase();
        char arr2[] = st.toCharArray();
        Arrays.sort(arr2);
        for (int i = 0; i < list.size(); i++) {
            String newStr = list.get(i);
            newStr = newStr.toLowerCase();
            char arr[] = newStr.toCharArray();
            Arrays.sort(arr);
            boolean result = Arrays.equals(arr2, arr);
            if (result) {
                //System.out.println(list.get(i));
                str=list.get(i);
            }

        }
        return str;
    }
}
