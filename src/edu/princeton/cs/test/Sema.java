package edu.princeton.cs.test;

import java.util.concurrent.Semaphore;

public class Sema {

	public static void main(String[] args) {
		final Semaphore pool = new Semaphore(3);
		int i=0;
while(i <20){
	i++;
	new Thread("thread "+i){
		@Override
		public void run(){
			try {
				pool.acquire();
			
			int j =0;
			while(j <10){
				System.out.println("thread +"+this.getName()+" j = "+(++j));
				Thread.sleep(1000);
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				pool.release();
			}
		}
	}.start();
}
	}

}
