package brew;

public class Pattern1 {

	public static void main(String[] args) {
		
		
		for (int j = 1 ; j <= 100 ; j++) {
			
			for (int s = 0; s <= j ; s++) {
				
				System.out.print(" ");
			}
			
		
				for(int  i  = 100 ; i >= j ; i-- ) {
					
			System.out.print("*");
			
			
		}
		
				
		System.out.println();
		
		}

	}

}
