import java.util.*;
public class Examp {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("i");
        l.add("am");
        l.add("learning");
        l.add("java");
        l.add("java");
        l.add(null);
        l.add(null);l.remove(4);
        Iterator itr=l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        }
        }

