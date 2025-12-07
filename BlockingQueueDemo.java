import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0 ;
    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue ;
    }

    @Override
    public void run() {
        while(true){

            try {
                System.out.println("Producer produced : " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("producer interrupted");
                System.out.println(e);
            }

        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue ;
    }

    @Override
    public void run() {
        while(true){

            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed : " + value);

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
                System.out.println(e);
            }

        }
    }
}

public class BlockingQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // capacity
        // a bounded, blocking queue backed by an array
        Thread Producer = new Thread (new Producer(queue));
        Thread Consumer = new Thread (new Consumer(queue));

        Producer.start();
        Consumer.start();

    }
}
