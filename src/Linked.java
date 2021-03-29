import java.util.*;
public class Linked {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(100);
        list.add(388);
        list.add(600);
        list.add(null);
        list.add(null);
        list.add(3,89);
        list.add(388);
        list.add(100);
        for ( Object num:list) {
            System.out.println(num);
        }
        }
    }

