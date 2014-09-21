package edu.princeton.cs.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Latch {

	public static void main(String[] args) throws InterruptedException {
		final CountDownLatch pool = new CountDownLatch(3);
		int i=0;
while(i <20){
	i++;
	new Thread("thread "+i){
		@Override
		public void run(){
			try {
				pool.await();
			
			int j =0;
			while(j <10){
				System.out.println("thread +"+this.getName()+" j = "+(++j));
				Thread.sleep(1000);
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}.start();
	Thread.sleep(5000);
	pool.countDown();
	//Thread.sleep(5000);
	pool.countDown();
	//Thread.sleep(5000);
	pool.countDown();
}
	}

}
