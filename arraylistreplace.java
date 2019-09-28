import java.util.*;
import java.lang.*;
public class arraylistreplace{
    public static void main(String[] args) {
        ArrayList<String> newlist= new ArrayList<String>();
    newlist.add("Apple");
    newlist.add("Grape");
    newlist.add("Melon");
    newlist.add("Berry");
    String replacer="Kiwi";
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the index you want to replace:");
    int index= input.nextInt();
    newlist.set(index, replacer);
    for(String str1:newlist){
        System.out.println(str1);
    }
    }

    

}