import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main18 {
    public static void main(String[] args) {
        char[] letters;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String[] words = {"listen", "cinema", "eat", "silent", "tea", "iceman", "act", "cat", "ate", "hound", "tac"};
        for (String s:words){
            letters = s.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if (!map.containsKey(newWord)){
                map.put(newWord,new ArrayList<>());
                map.get(newWord).add(s);
            }
            else {
                map.get(newWord).add(s);
            }
        }
        System.out.println(map);
    }
}
