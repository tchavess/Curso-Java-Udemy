package application;

import java.util.Calendar;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Digite linhas M: ");
		//int m = sc.nextInt();
		//System.out.print("Digite colunas N: ");
		//int n = sc.nextInt();
		
		//int m = sc.nextInt();
		//int n = sc.nextInt();
		
		int[][] mat = new int[][]{{10,8,15,12},{21,11,23,8},{14,5,13,19}}; 
		
		for(int i=0 ; i < mat.length ; i++){
			for(int j = 0 ; j < mat[i].length ; j++) {
				System.out.print(mat[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		System.out.println();
		
		
		for(int i=0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				if(mat[i][j] == num) {
					System.out.println("Position:"+ i+","+j);
					if(j > 0)
					System.out.printf("Left: %d\n", mat[i][j-1]);
					if(j < mat[i].length-1)
					System.out.printf("Right: %d\n", mat[i][j+1]);
					if(i > 0)
					System.out.printf("UP: %d\n", mat[i-1][j]);
					if(i < mat.length-1)
					System.out.printf("Down: %d\n",mat[i+1][j]);
					
					System.out.println();
					
				}
				
			}
		}
		
		
sc.close();
	}

}
