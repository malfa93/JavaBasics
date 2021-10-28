package Class7;

public class SumEvenOdd {

	public static void main(String[] args) {
		
		int odd, even;
		odd=0;
		even=0;
		
		
		for(int k=1; k<=100; k+=2) {
			
			odd=odd+k;
			
			System.out.print(k+" ");
		}
		System.out.println(" ");
		System.out.println("The sum of all odd numbers is: "+odd);
		
		for(int a=0; a<=100; a+=2) {
			
			even=even+a;
			
			System.out.print(a+" ");
		}
System.out.println();
System.out.println("The sum of all even numbers is: "+even);

	}

}
