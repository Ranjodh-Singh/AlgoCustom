package edu.princeton.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sudoku {
	static List<Integer > numbers;
	static {
		numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	}
public void createBoard(int board[][]){
	if(board.length <= 10 ){
		for (int i = 0; i < board.length; i++) {
			if(board[i].length > 10){
				System.out.println("Invalid input. Please input the size less than 10.");
				return;
			}
		}
	}else {
		System.out.println("Invalid input. Please input the size less than 10.");
		return;
		}
	for (int i = 0; i < board.length; i++) {
		Collections.shuffle(numbers.subList(0, board[i].length));
		board[i] = List2ArrayConverter(board[i], numbers);
	}
	System.out.println("Sudoku board created with some random integers.");
	for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board[i].length; j++) {
			System.out.print(board[i][j] + " ");
		}
		System.out.println();
	}
}
private int[] List2ArrayConverter(int[] is, List<Integer> numbers2) {
	int i=0;
	for (Iterator<Integer> iterator = numbers2.iterator(); iterator.hasNext() && i < is.length;i++) {
		Integer integer = (Integer) iterator.next();
		is[i]=integer;
	}
	return is;
}
}
