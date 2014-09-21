/**
 * 
 */
package edu.princeton.cs.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




/**
 * @author ranjodh.singh
 *A rabbit is sitting at x = 0. It can only jump to the right towards the positive x-axis. In the kth jump, the rabbit jumps either k meters or k+1
 * meters to the right. For example, in the 5th jump the rabbit can jump either 5 meters or 6 meters to the right. How many jumps does the rabbit need to reach point p?
 */
public class Rabbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Reader.init(System.in);
		int tests = Reader.nextInt();
		int number[] = new int[tests];
		int results[] = new int[tests];
        for (int i = 0; i < tests; i++) {
        	int jump =1,count=1;
        	number[i] = Reader.nextInt();
			for (int j = 3; j <= number[i]; j+=count) {
				jump = jump + j;
				count++;
				//System.out.println("jump:"+jump);
				
			}
			results[i] =count;;
		}
        for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
	 static class Reader {
	        static BufferedReader reader;
	        static StringTokenizer tokenizer;

	        /** call this method to initialize reader for InputStream */
	        static void init(InputStream input) {
	            reader = new BufferedReader(
	                         new InputStreamReader(input) );
	            tokenizer = new StringTokenizer("");
	        }

	        /** get next word */
	        static String next() throws IOException {
	            while ( ! tokenizer.hasMoreTokens() ) {
	                //TODO add check for eof if necessary
	                tokenizer = new StringTokenizer(
	                       reader.readLine() );
	            }
	            return tokenizer.nextToken();
	        }
	        static String nextLine() throws IOException {
	            
	                //TODO add check for eof if necessary
	                
	        	return  reader.readLine() ;
	            
	             
	        }

	        static int nextInt() throws IOException {
	            return Integer.parseInt( next() );
	        }
	    	
	        static double nextDouble() throws IOException {
	            return Double.parseDouble( next() );
	        }
	    }
}
