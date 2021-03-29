import java.util.*;
public class ForArrayList {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<String>();
        list.add("mango");
        list.add("banana");
        list.add("grapes");
        for (String fruit:list) {
            System.out.println(fruit);

        }
    }
}
