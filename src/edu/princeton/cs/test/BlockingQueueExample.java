package edu.princeton.cs.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	 public static void main(String[] args) throws Exception {

	        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

	        Producer producer = new Producer(queue);
	        Consumer consumer = new Consumer(queue);

	        new Thread(producer).start();
	        new Thread(consumer).start();

	        Thread.sleep(4000);
	    }
}
class Producer implements Runnable{

    protected BlockingQueue<String> queue = null;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	int i=0;
        	while(i <100){
            queue.put(""+i++);
            
        	}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Consumer implements Runnable{

    protected BlockingQueue<String> queue = null;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while(true){
        	System.out.println(queue.take());
            }
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}