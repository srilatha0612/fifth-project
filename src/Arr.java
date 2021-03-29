import  java.util.*;
public class Arr {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(30);
        list.add(70);
        list.add(30);
        list.add(10);
        list.add(null);
        list.add(null);
        list.remove(4);
        for (Object num:list) {
            System.out.println(num);
        }
        }
    }

