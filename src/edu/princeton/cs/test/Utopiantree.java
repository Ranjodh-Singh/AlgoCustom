package edu.princeton.cs.test;

import edu.princeton.cs.test.Super.Reader;

public class Utopiantree {
	//2 0 1 :: 1 2

	public static void main(String[] args) throws Exception {
		Super.Reader.init(System.in);
		int tests = Reader.nextInt();
		int cycles[] = new int[tests];
		int heights[] = new int[tests];
		
		for (int i = 0; i < tests; i++) {
			cycles[i] = Reader.nextInt();
		}
		for (int j = 0; j < heights.length; j++) {
			
			int h =1;
			for (int j2 = 0; j2 < cycles[j]; j2++) {
				
				if( (j2+1)%2 == 0){
					 h = getnewHeight(h,Season.SUMMER);
				}else {
					 h = getnewHeight(h,Season.MONSOON);
				}
				
			}
			heights[j]=h;
		}
		for (int i = 0; i < heights.length; i++) {
			System.out.println(heights[i]);
		}
	}
	private static int getnewHeight(int i, Season monsoon) {
		if(monsoon == Season.MONSOON){
			i = i*2;
		}else{
			i=i+1;
		}
		return i;
	}
	enum Season{
		MONSOON,SUMMER;
	}

}
