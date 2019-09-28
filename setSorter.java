import java.util.*;
class setSorter{
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER OF STRINGS YOU WANT TO ADD");
        TreeSet<String> treeSet= new TreeSet<String>();
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        for(int i=0;i<num;i++){
            String str=input.next();
            treeSet.add(str);
        }
        List<String> li=new ArrayList<String>(treeSet);
        System.out.println(li);

    }
}