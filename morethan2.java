import java.util.*;
import java.io.*;
public class morethan2 {

    public static void main(String[] args)throws IOException {
      
        String[] a={"a","b","c","d","a","c","c"};
               
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        for(Map.Entry<String,Integer> entry: words.entrySet()){
                if(entry.getValue()>=2){
                    System.out.println(entry.getKey()+" " + "true");
                }else{
                    System.out.println(entry.getKey()+" " + "false");
                }
        }
    }
}