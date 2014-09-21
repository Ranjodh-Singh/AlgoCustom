package edu.princeton.cs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movies {

	public static void main(String[] args) {
		List<?> l1=null;
		List<Object> l2 = new ArrayList<Object> ();
 List <String> l3 = new ArrayList<String>();
 List <Integer> l4 = new ArrayList<Integer>();
 l1=l2;
 l1=l3;
 l2=l3;
 l3=l4;
	}
static int getMovies(int[] movie_start,int[] movie_end){
	int result=0;
	int movie_age[] = new int[movie_start.length];
	for (int i = 0; i < movie_start.length; i++) {
		movie_age[i]=movie_end[i]-movie_start[i];
	}
	Arrays.sort(movie_age);
	
 return result;
}

}
