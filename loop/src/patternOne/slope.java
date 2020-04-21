package patternOne;

import java.util.Scanner;


public class slope {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n  = sc.nextInt();
		
		//int ab = sc.nextInt(); 
		
		int ab = 0;
		/*
		for ( int i = 1 ; i <= n ; i++ ) {
			
		       System.out.println(n);
			
			for(int j = n; j < ab ; j--) {
			
				
				System.out.println(n);
				System.out.print(" * ");
			    
			}
			
		    System.out.println();
			
			
			
		}
		*/
		
		/*
		for (int p = n - (n + n) ; p <= 0  ; p++) {
			System.out.println(p);
			
		     }
		
		
		}
		*/
	
		/*
		for (int i  = n -(n + n) ; i <= n ; i++) {
			
			for(int j = -1 ; j >= i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	


	
*/
		
/*		
		int t = 0;
		
		for (int i = 1; i <= n ; i++) {
			
			//System.out.println("printk");
			
			for(int j = 1 ; j <= i ; j++) {
				
				System.out.print(" ");
			    
			}

				t++;
				
				for ( int j = 0 ; j <= (n - t) ; j++) {
					System.out.print("*");
				}
			
			    
				
		System.out.println();
		
		} 

*/
		
		
/*		
		for (int k  = n -(n + n) ; k <= n ; k++) {
			
			for(int l = -1 ; l >= k; l--) {
				System.out.print("*");
			    }
		}

*/		
		
		
/*		
	int  t = 0; 	
		
	for (int i = 0 ; i <= 5 ; i++) {
		
		t++;
		
		
		for ( int j = 0 ; j <= (n - t) ; j++) {
			System.out.print("*");
		}
	
	    System.out.println();
	}

	
		*/
		
		
		
		//d
		
/*
		for (int i = 1; i <= n ; i++){
			
			 for (int s = 1; s <= (n-i); s++) {
				 System.out.print(" ");
			 }
			
			 
		
		 
		    for (int st = 1; st <= i ; st++) {
		    	System.out.print("*");
		    }
			
			
		    System.out.println();
			
			
			
			
			
			
			
			
			
			
		}
		
	*/
		
		/*
		
		for (int i = 1 ; i <= n ; i++) {
			
			
			for (int a = 1; a <= 2*(n-i); a++) {
				System.out.print(" ");
			}
			
			for (int b = 1; b <= i ; b++) {
				System.out.print("*   ");
			}
			
			System.out.println();
				
		}
		
		*/
		
		
		/*
		int count = 0 ; 
		
		for (int i = 1; i <= n ; i++) {
			
			
			
			for (int a = 1 ; a <= 2*(n-i) ; a++) {
				
				System.out.print(" ");
				
				
			}
			
			for (int b = 1; b <= i ; b++) {
				
				count++;
				System.out.print(count +"   ");
				
			}
			
			
			
			System.out.println();
			
			
			
		}
          
           		*/
		
		/*
		
		
        int rows = 2*n-1;
		
		
		for (int i = 1; i <= rows ; i++) {
			
			if ( i <= n) {
						
			   for(int a = 1; a <= i  ; a++) {
				System.out.print("*");
			    
			   }
			} else {
			
			
			
			    for(int a = 1 ; a <= rows-i+1; a++) {
				
				System.out.print("*");
				
				
			    }
			    
			}
			
			System.out.println();	
			
			
			
		}
		
		*/
		
/*		int spaces = 0;
		int stars = 1;
		
		System.out.println("*");
		*/
		/*
		for(int i = 1 ; i <= n  ; i++) {
			
			//spaces =  i - stars;
			
			System.out.print("*");
			
			
		}	
		
		
			
			
			
			for (int a = 1; a <= i - spaces ; a++ ) {
				
			   System.out.print("*");	
				
			   
			   System.out.print(spaces);
			}
			
		
			System.out.println();

			
		}
		*/
		
		/*
		
	    for (int i = 1; i <= n ; i++ ){
		
		for (int l = 1; l <= i ; l++) {
			
	        		
			 for (int star = 1; star <= ; star++) {
				 
				 System.out.print("*");
				 
				 
			 }
			 
			 for (int space = 0; star <= ; space++) {
				 
				 System.out.print(" ");
			 }
			
			
			
			System.out.println();
			
			
			
			
			
			
		}
		
	    }
		
		*/
		
		
		
		/*
		
		for (int i = 2 ; i <= n-1 ; i++) {
			
			System.out.print("*");
			
			for (int j = 1; j <= i-2 ; j++) {
				System.out.print(" ");
				
			}
			
			System.out.print("*");
			System.out.println();
			
		}
		*/
		
		
		/*
		
		for (int i = 1; i <= n ; i++) {
			
			for (int j = 1; j < i ; j++ ) {
				System.out.print(" ");
			}
			
			for (int j = 1 ; j <= n-i ; j++) {
				System.out.print("*");
				
			}
			
			
			
			
			System.out.println();
			
			
			
		}
		 */
		
		
		/*
		
          for (int i = 1; i <= n ; i++) {
			
			for (int j = 1; j < i ; j++ ) {
				System.out.print("  ");
			}
			
			for (int j = 1 ; j <= n-i ; j++) {
				System.out.print("*");
				
			}
			
			
			
			
			System.out.println();
			
			
			
		}
		
		*/ /*
		
		for (int i = 1; i <= n ; i++) {
			
			for(int j = 1 ; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*   ");
				
			}
			
			System.out.println();
				
		}
		
		*/
		
		
		
		
		
		

		int max = 1;
		int ionlyonce = 1;
		int elsee = 1;
		
		for (int i = 1; i <= n ; i++) {
			
			
			if(max < n) {
			     for (int j = 1; j <= (n-i) ; j++) {
				
				 System.out.print(" "); };
				 
				  for (int j = 1; j <= i ; j++) {
						
					    System.out.print("*");
			           };
				
				
				
			      
			
			      max++;
			
			}else{
			       
			  
				
				if(ionlyonce == 1) {
					
					i = i -  (n-1);
				    ionlyonce++;
				}  else {
					      elsee++;
					
				         };
			

   
			   
			   
			   
			};
//			System.out.println();
	
		   
			  
		       for (int j = 1; j <= i ; j++ ) {
		        
		    	   System.out.print(" "); 
		        
		       }
		 
		  for (int j = 1 ; j <= n-i ; j++) { 
			  
			  
			  System.out.print("*");
		 
		 };
		 
		
	
		  
		 
		 System.out.println();
		 
		 
		 
		};		
		
/* Let's try to a equate a eqution and solve it..
 * 
 *     -output
 *       
 *     #1 |    *  
 *     #2 |   **
 *     #3 |  ***
 *     #4 | ****
 *     #5 |*****
 *     #6 | ****
 *     #7 |  ***
 *     #8 |   **
 *     #9 |    *
 * 
 *      no. of lines represented by i , if talking about line one than
 *      we i value must be 1 if two that i = 2 and so on..
 *     
 *      likewise, no. of stars present in one row or line will be represented
 *      by the variable star and for spaces we will choose variable space
 * 
 *      when 
 *      
 *      n = 5 ;
 *      i = 1 ;
 *      star = 1;
 *      space = 4;
 *      
 *      thus eq = 2*(i + star) = space 
 *      
 *      when 
 *      
 *      i = 2;
 *      stars = 2;
 *      space = 3; 
 *      
 *      thus eq = space*(stars+i) = space*4;
 *      
 *     when 
 *     
 *     i = 3 ; 
 *     
 *     stars = 3
 *           
 * 
 * 
 * 		
 * 
 *    n = 1
 *    i = 0   eq = n-1 =  i 
 * 
 *    n = 5 
 *    i = 8  eq = 
 *    
 *    
 *    n = 2
 *    i = 3  eq = n + 1 = i
 *    
 *    n = 4
 *    i =7  eq = n + 3 = i
 *    
 *    n = 3;
 *    i = 5; eq = n 
 *    
 *    n = 5; 
 *    i = 9; eq = 
 *    
 *    n = 6;
 *    i = 11; eq = 
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *      
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 */
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
  		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



}
}