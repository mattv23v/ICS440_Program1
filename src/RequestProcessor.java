/**
 * This class runs the threads and creates a queue to to store Bean Statistic objects.
 */

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class RequestProcessor implements Runnable {
    private Queue<Integer> collection;
    private final Lock lock = new ReentrantLock();

    public RequestProcessor(Queue<Integer> collection) {
        this.collection = collection;

    }

    /**
     * Creates bean statistics instance, runs threads until all beans are accounted for, saves beans in stats instance
     * according to thread ID.
     */
    @Override
    public void run() {
        BeanStatisticsSetup stats = new BeanStatisticsSetup();
        ArrayList<Integer> beanList = new ArrayList<Integer>();


        for (int i = 0; i<10000; i++){

            lock.lock();
            if(!collection.isEmpty()) {

                beanList.add(collection.dequeue());
            }
            lock.unlock();

        }
         stats.sort(beanList);
         BeanStatisticsSetup.enqueue(stats);

    }


}
