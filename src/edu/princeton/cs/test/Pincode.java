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
 *
 */
public class Pincode {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Reader.init(System.in);
		
		int tests = Reader.nextInt();
		int n[] = new int[tests];
		int m[] = new int[tests];
		int result[] =  new int[tests];
		int localM []=null;
		String mString[] = new String[tests];
		System.out.println("number of tests : "+tests);
		for (int i = 0; i < tests; i++) {
			n[i] = Reader.nextInt(); m[i] = Reader.nextInt();// n  m
			mString[i] = Reader.nextLine();
		    //start processing here only.
			String widthSA[] = mString[i].split("\\s");
			//System.out.println("width length = "+freewayLength+tests+widthSA.length);
			localM = new int[widthSA.length];
			int j = 0;
			for (String string :widthSA ) {
			localM[j] = Integer.parseInt(string);
			//System.out.println( " array width ="+width[i]);
			j++;
			}
			int lcm = 1;

	        for(int x : localM)
	            lcm = x * lcm / ggt(x, lcm);
	        //System.out.println("lcm is ::"+lcm);
	        result[i] = n[i]/lcm;
	        
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println();
	}
	  static int ggt(int a, int b)
	    {
	        if (b == 0)
	            return a;
	        return ggt(b, a % b);
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
