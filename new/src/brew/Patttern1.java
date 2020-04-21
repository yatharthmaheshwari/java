package brew;

import java.util.Scanner;

public class Patttern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
               
		int n = sc.nextInt();
		
		
		
		
		for (int j = 10; j >= 1 ; j-- ) {
		
			
			System.out.println();
			int multiple = j;
			
			
			
		 for(int i = 1; i <= multiple; i++ ) {
			 System.out.print(" ");
			 System.out.print(" *");
		 }
		}
	}

}
