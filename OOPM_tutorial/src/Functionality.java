public class Functionality {

	public static int quersumme(int n){	
		
		int x = 0;
		while (n != 0){
			x = x + n %10;
			n = n/10; 	
		}
				
		return x;
			
	}
}
