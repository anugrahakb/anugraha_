import java.util.Scanner;

public class IfSample {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		if(a>0) {
			System.out.println("Number is Positive");	
		}
		else {
			System.out.println("Number is negative");
		}
		
	}

}
