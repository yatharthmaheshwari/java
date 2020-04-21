package first;

public class Arraysforme {

	public static void main(String[] args) {
		
        //dataType[] arrayName = new dataType[n];
        
		int[] marks;
		marks = new int[10];
		
        int[] age = {10,20,30};
		
        double[] percentage = {20.222, 32.232,  23.242};
//		int class[], section[];
//		class, new int[52];
		
        double[] learn = {1.1 , 2.2 ,3.3, 4.4 , 5.5};
         
       
//		System.out.println(marks[10]);
        
        percentage[1] = 99.999;
		
		System.out.println(percentage[1]);
		
		for (int i = 0 ; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
	}

}
