import java.util.*;
public class ArryList {
    public static void main(String[] args) {
       ArrayList l=new ArrayList();
       l.add(10);
       l.add(20);
       l.add(30);
       l.add(40);
       l.add(30);
       l.add(40);
       l.remove(4);
       l.add(null);
       l.add(null);
       Iterator itr=l.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }

    }
}
