import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq= new java.util.PriorityQueue();
        pq.add(12);
        pq.add(3);
        pq.add(21);
        pq.add(1);

        for(int i  : pq){
            System.out.println(i);
        }
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
            // elements are polled with the priority level..
            // for primitive the smaller
        }



        java.util.PriorityQueue<String> pq1 = new java.util.PriorityQueue<>();
        pq1.add("mad");
        pq1.add("ad");
        pq1.add("aad");
        pq1.add("zaad");

        System.out.println(pq1);
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }


        Deque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.addFirst(1);
        arrDeq.addLast(2);
        arrDeq.offerFirst(0);
        System.out.println(arrDeq.poll());
        // same as pollFirst
        ; // same as poll
        System.out.println(arrDeq.getLast());
        System.out.println(arrDeq.pollFirst());


    }
}
