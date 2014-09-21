package edu.princeton.cs.test;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	
public static final void main(String[] args) throws ClassNotFoundException {
	//Class.forName("");
	System.out.println("happy ");
	int a[] = new int[0],b,c;

	b=10;
	switch(b){
	 default: System.out.println("defult");
	case 0: System.out.println("jadkf");
	}
	//a=b=c=20;
	boolean s=true , v=true;
	if(s=v);else;/*{
		System.out.println("rs");
	}*/
	try{
		
	}finally{
		
	} 
List<String> l1= new ArrayList<String>();

List<Integer> l2= new ArrayList<Integer>();
	System.out.println("sssssssssss"+(l1.getClass()==l2.getClass()));
	//
	byte g=1;
	while(g++>0){
		g&=g;
	}
	System.out.println("hi there");
	int h = 2000000000;
	System.out.println("ooooo"+h*h);
	add(1/2);
	add(3.14f);
	Solution sss= new Solution();
	Animal aa = new Tiger();
	Tiger tt= new Tiger();
	sss.identity(aa);
	sss.identity(tt);
	Object nn= new Object(){
		public boolean equals(Object o){
			return true;
		}
	};
	System.out.println(nn.equals("rrrr"));
	if(5 < 10 | 5> 0){
		System.out.println("whats up");
	}
	String yy = "rrr";
	yy.toUpperCase();
	System.out.println("yyy"+yy);
	FileOutputStream ooo=null;
	/*try{
		ooo= new FileOutputStream(file)
	}catch(myEc see){
		System.out.println("111");
	}catch(myE2 rr){
		System.out.println("222");
	}*/
}
private static void add(float f) {
	// TODO Auto-generated method stub
	System.out.println("jkl"+f+3.14);
}
static String  method(Object x,Object y){
	
	return (x==y)+""+x.equals(y)+" "+(x.hashCode()==y.hashCode());
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
public void identity(Animal a){
System.out.println("Animal");	
}
public void identity(Tiger t){
	System.out.println("tiger");
}
}

class Animal{
	
} class Tiger extends Animal{
	
}
abstract class GNN{
	GNN(int n){
		
	}
	abstract int bas();
	
}
class myEc extends Exception{
	
}
class myE2 extends myEc{
	
}