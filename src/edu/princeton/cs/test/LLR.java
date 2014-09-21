/**
 * 
 */
package edu.princeton.cs.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author ranjodh.singh
 *
 */
public class LLR {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
Reader.init(System.in);
		
		int tests = Reader.nextInt();
		StringBuilder words[] = new StringBuilder[tests];
		String result[] = new String [tests];
		for (int i = 0; i < words.length; i++) {
			words[i] = new StringBuilder(Reader.next());
		} int in = 0;
        for (StringBuilder word  : words) {
        	//do the processing for each string.
        	boolean found = false;
        	String reverseAlpha =new String("zyxwvutsrqponmlkjihgfedcba"); 
			for (int i = 0; i < reverseAlpha.length(); i++) {
				int indexF = word.indexOf(""+reverseAlpha.charAt(i));
				int indexL = word.lastIndexOf(""+reverseAlpha.charAt(i));
				if(indexF !=-1){
					char largestChar = reverseAlpha.charAt(i);
					found = true;
					if(indexF == indexL){
						//we found the answer and break from here constructing the string from i to i-1.
						StringBuilder temp  = new StringBuilder();
						result[in]=temp.append(word.substring(indexF)).append(word.substring(0, indexF)).toString();
						
						break;
					}else {
						// here indicates the more letter with higher degree is present so extract each one and sort them.
						List<String> tempList = new ArrayList<String>();
						StringBuilder temp  = new StringBuilder();
						String original = word.toString();
						
						tempList.add(temp.append(word.substring(indexF)).append(word.substring(0, indexF)).toString());
						for (int j = original.indexOf(""+largestChar, indexF+1) ; j > 0 ; j = original.indexOf(""+largestChar, j+1)) {
							
							
								//System.out.println("indexes ="+j);
							StringBuilder temp1  = new StringBuilder();
							tempList.add(temp1.append(word.substring(j)).append(word.substring(0, j)).toString());
							
						}
						/*for (String string : tempList) {
							System.out.println("list is"+string);
						}*/
						Collections.sort(tempList, Collections.reverseOrder());
						result[in] = tempList.get(0);
						break;
					}
					
				}
			} in++;
		}
        for (String string : result) {
			System.out.println(string);
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
