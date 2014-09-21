package edu.princeton.cs.test;

import java.io.*;
import java.util.*;


public class Super {

    public static void main(String[] args) throws Exception {
        Reader.init( System.in );
        int length = Reader.nextInt();
        String []rocks = new String[length];
        for(int i = 0;i < length;i++){
            rocks[i] = Reader.next();
        }
        Map<Character , Integer > countMap = new HashMap<Character,Integer>(26);
        Set<Character> localSet=null;
        for(String rock:rocks){
        	localSet = new HashSet<Character>();
            for(int j =0; j < rock.length();j++){
                
                localSet.add(rock.charAt(j));
            }
            for(Character cha : localSet){
                if(countMap.containsKey(cha)){countMap.put(cha,countMap.get(cha)+1);
                } else {
                    countMap.put(cha,1);
                }
                System.out.println(countMap.get(cha));
            }
            localSet = null;
        }
        int result = 0;
        for(Integer value : countMap.values()){
            if(value  == length){
                result = result+1;
            }
        }
        System.out.print(result);
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

        static int nextInt() throws IOException {
            return Integer.parseInt( next() );
        }
    	
        static double nextDouble() throws IOException {
            return Double.parseDouble( next() );
        }
    }
}

