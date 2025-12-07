import java.util.*;

public class Sets  {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(112);
        set.add(1);
        System.out.println(set.contains(12));
        System.out.println(set.isEmpty());

        System.out.println(set);


        for( int i : set){
            System.out.println(i);
        }
    }
}
