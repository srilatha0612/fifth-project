import  java.util.*;
public class ForEachExmp {
    public static void main(String[] args) {
        ArrayList <Integer> l=new ArrayList();
        l.add(20);
        l.add(39);
        l.add(50);
        l.add(45);
        l.add(null);
        l.add(null);
        l.add(0,9);
        for (Integer num :l) {
            System.out.println(num);
        }
        }
        }



