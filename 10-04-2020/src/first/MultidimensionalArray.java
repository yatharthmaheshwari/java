package first;
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
//		int hellovello[][] = new int[5][5];
//		
//		System.out.println("please input value for hellovello [1][1]");
//		
//		System.out.println("enter the value of number one");
//        int numberOne = sc.nextInt();
//        System.out.println("enter the value of number second");
//        int numberTwo = sc.nextInt();
//        
//        hellovello[0][0] =  numberOne;
//        hellovello[1][0] =  numberTwo;
//       
//        
//        System.out.println(hellovello[0][0] + hellovello[1][0]);
////		System.out.print(hellovello[1][0]);
		
		
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       
       int a[][] = new int[rows][cols];
       int b[][] = new int[rows][cols];
       
       
       System.out.println(a.length);
       System.out.println(b.length);
       
		
	}
	
}
		