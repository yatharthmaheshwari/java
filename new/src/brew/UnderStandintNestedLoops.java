package brew;

import java.util.Scanner;
public class UnderStandintNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How to Make make changes in the Loop which is inside a nested loop
		
		
		//first we will make a nested Loop
		
		// to decrease the complexity we will Keep the loop different
		
		// Empty variable for or Loop
		
      int result = 0;
      
      // number to multipy
      
      
      Scanner sc = new Scanner(System.in);
      
      
      int n  = sc.nextInt();
      
      
      
	  
      
      for(int j = 1; j <= n ; j++) {
             for(int i = 1 ; i <= 10 ; i++){
            	
		  result  =  j * i;  
	  System.out.println(result);
		      
                
             }
		System.out.println(" ");
	  
	}
	      
		
	}

}

