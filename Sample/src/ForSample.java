import java.util.Scanner;

public class ForSample {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum =0;
		int i;
		for(i=0;i<num;i++)
		{
			sum = sum+i;
		}
		
		System.out.println("Result="+ sum);
	}

}
