package edu.princeton.cs.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ServiceLane {

	public static void main(String[] args) throws Exception {
		Reader.init(System.in);
		int freewayLength = Reader.nextInt();
		int tests = Reader.nextInt();
		int width [] = null;
		int entry[] = new int[tests];//i
		int exits[] = new int[tests];//j
		String widthS = Reader.nextLine();
		String widthSA[] = widthS.split("\\s");
		//System.out.println("width length = "+freewayLength+tests+widthSA.length);
		width = new int[widthSA.length];
		int i = 0;
		for (String string :widthSA ) {
		width[i] = Integer.parseInt(string);
		//System.out.println( " array width ="+width[i]);
		i++;
		}
		for (int j = 0; j < tests; j++) {
			entry[j] = Reader.nextInt();
			exits[j] = Reader.nextInt();
		}
		////////finished taking input and setting the variables.
		int result[] = new int[tests];
		for (int j = 0; j < tests; j++) {
			int min = Integer.MAX_VALUE;
			for (int j2 = entry[j]; j2 < exits[j]; j2++) {
				//here we will try to find the minimum between entry and exit , better approach will be to use splay tree, or segment tree which is heap like structure and give log n time for getting minimum.
				if(width[j2] < min)
				min = width[j2];
				
				
			}
			result[j] = min;
		}
		for (int j = 0; j < result.length; j++) {
			if(result[j] > 3)
				result[j]=3;
		}
		

	}
	enum Vehicle{
		BIKE(1),CAR(2),TRUCK(3);
		private final int id;
		Vehicle(int id){
			this.id = id;
		}
		public int getValue(){
			return id;
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
