import java.util.*;
import java.io.*;
public class counter {

    public static void main(String[] args)throws IOException {
        String str1="one one -one___two,,three,one @three*one?two";
        str1=str1.replaceAll("\\p{Punct}"," ");
        String[] a=str1.split(" ");

        
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);
    }
}