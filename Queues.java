import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(12);
//        list.add(2);
//        list.add(1);
//        list.add(121);
        System.out.println(list.size());
        System.out.println(list.remove()); // throws exception if empty
        System.out.println(list.poll()); // doesnt throw exception

        System.out.println(list.element()); // throw exception when empty
        System.out.println(list.peek()); // doest throw exception if empty


    }
}
