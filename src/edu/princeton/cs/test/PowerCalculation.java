package edu.princeton.cs.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

import java.util.StringTokenizer;



public class PowerCalculation {

	public static void main(String[] args) throws Exception {
		Reader.init(System.in);
		int tests = Reader.nextInt();
		BigInteger  result[] = new BigInteger[155555];
		
		result[0]= new BigInteger("0");
		result[1]=new BigInteger("1");
		
		BigInteger m = new BigInteger("100");
		String resul[] = new String[tests];
		for (int i = 0; i < tests; i++) {
			BigInteger n = new BigInteger(Reader.next());//n for series
			BigInteger k = new BigInteger(Reader.next());// k for power 1^k+2^k+...+n^k.
			BigInteger re = new BigInteger("1");
			for (BigInteger j = new BigInteger("2"); j.compareTo(n) <= 0 ; j = j.add(BigInteger.ONE)) {
				re = re.add(ipow(j,k).mod(m));
			}
			resul[i] = re.mod(new BigInteger("100")).toString();
			
		}
		for (int i = 0; i < resul.length; i++) {
			if(Integer.parseInt(resul[i]) < 10 ){
				System.out.println("0"+resul[i]);
			}else 
			System.out.println(resul[i]);
		}
		/*for (int j = 1; j < 155555;j++) {
			result[j]=calculateSquareSumTillJ(j,result);
		}
		// keeping the results in 10^8 which is sqrt of 10^16.
		for (int i = 0; i < tests; i++) {
			BigInteger  X = new BigInteger(Reader.next());
			
			int  ansLocal = Arrays.binarySearch(result,X);
			if(ansLocal < 0)
				ansLocal = Math.abs(ansLocal+ 2);
			ans[i] = ansLocal;
			System.out.println("result is : ");
			for (int j = 0; j < result.length; j++) {
				System.out.println(result[j]);
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
*/
	}
	static BigInteger ipow(BigInteger base, BigInteger exp)
	{
		BigInteger result = BigInteger.ONE;
	    while (exp.compareTo(BigInteger.ZERO) >= 0)
	    {
	        if (exp.and(BigInteger.ONE).compareTo(BigInteger.ZERO) >= 0)
	            result =  result.multiply(base);
	        exp = exp.shiftRight(1);
	        base = base.multiply(base);
	    }

	    return result;
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
