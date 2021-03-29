import java.util.*;
public class ArrLisExmp {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(300);
        list.add(45);
        list.add(657);
        list.add(null);
        list.add(null);
        list.remove(3);
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }

