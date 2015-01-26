package edu.princeton.test;

import java.util.Iterator;


public class TOH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack< Integer > stack1 = new Stack<Integer>();
Stack< Integer > stack2 = new Stack<Integer>();
Stack< Integer > stack3 = new Stack<Integer>();
stack1.push(9);
stack1.push(8);
stack1.push(7);
stack1.push(6);
stack1.push(5);
stack1.push(4);
//stack is full for one tower .

/*stack.pop();
stack.push(4);
stack.push(3);
stack.push(2);
stack.push(1);
stack.push(11);*/

/* fix this iterator.
 * for (Integer object : stack) {
	System.out.println("items in the stack are  : "+object);
}*/
	}
	public static void createTOH(Stack<Integer> first,Stack<Integer> second, Stack<Integer> third){
		
		
	}
	public static class Stack<T> implements Iterable<T> {
		Node []items;
		int min = Integer.MAX_VALUE;
		int head = -1,size;
		private final int DEFAULT_CAPACITY = 10;
		public Stack(){
			items = new Node[DEFAULT_CAPACITY];
			size = 9;
		}
		public Stack(int capacity){
			items = new Node[capacity];
			size = items.length-1;
		}
		boolean isEmpty(){
			return head == -1 ? true:false;
		}
		boolean isFull(){
			return head == size ? true:false;
		}
		public void push(T item){
			if(!isFull()){
				/*if(!(head == -1) && (item > items[head].getItem())) {
					System.out.println("Invalid push");
					return;
				}*/
			head++;
			items[head] = new Node<T>(item);
			}
			else {
				System.out.println(" Stack is full ");
			}
		}
		public T pop(){
			if(!isEmpty()){
				T removed = (T)items[head].getItem();
				
				items[head] = null;
				head--;
				return removed;
			}
			System.out.println("stack is empty.");
			return null;
		}
		@Override
		public Iterator<T> iterator() {
			
			return new Iterator<T>(){
                  int current  = -1;
                  int last  = items.length-1;
				@Override
				public boolean hasNext() {
					if(current+1 <= last )
						return true;
					return false;
				}

				@Override
				public T next() {
					if(hasNext()){
						return (T) items[++current].getItem();
					}
					return null;
				}

				@Override
				public void remove() {
					// TODO Auto-generated method stub
					
				}
				
			};
		}
	}
	/*
	 * class for generic type of Object Node with single property E.
	 */
	public static class Node<E>{
		private E item;
		public Node(E item){
			this.item = item;
		}
		public E getItem(){
		  return item;
		}
	}

}
