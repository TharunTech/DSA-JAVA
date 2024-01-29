package dataStructures;

public class FactorialWithRecrsion {
	public static void main(String[] args) {
		int result = fact1(5);
		System.out.println(result);
		
	}
	
	public static int fact1(int i) {
		
		if(i!=0) {
			
			i =  i*fact1(i-1);
			return i;
		}
		
		return 1;
	}

}
