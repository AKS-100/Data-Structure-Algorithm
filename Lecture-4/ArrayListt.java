import java.util.*;
public class ArrayListt {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(12);
        list.set(0,99);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.contains(12));
        System.out.println(list.get(0));
    }
}
