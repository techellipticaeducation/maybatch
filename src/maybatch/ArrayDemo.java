package maybatch;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {

		// class ke subhect 
		// Arrays

		// array need size at the time of initialization
		// once you array 

		int[][] marks = new int[5][3]; 
		marks[0][0] = 10;
		marks[0][1] = 20;
		marks[0][2] = 50;

		marks[1][0] = 60;
		marks[1][1] = 20;
		marks[1][2] = 90;

		marks[2][0] = 30;
		marks[2][1] = 20;
		marks[2][2] = 80;

		marks[3][0] = 50;
		marks[3][1] = 70;
		marks[3][2] = 50;

		marks[4][0] = 10;
		marks[4][1] = 20;
		marks[4][2] = 50;


		//System.out.println(marks[3][1]);

		//		System.out.println(marks[5]);

		// yes we update
		//marks[2] = 160;
		//		System.out.println(marks[2]);

		// Iterate
		//		for(int i = 0; i < marks.length ;i=i+2) {
		//			System.out.println(marks[i]);
		//		}

		// for each loop , collections, list, set, map, array, queue
		for(int[] a : marks) {
			System.out.println("------");
			for(int k : a) {
				System.out.println(k);					
			}
		}

		System.out.println(Arrays.toString(marks[0]));





	}
}
