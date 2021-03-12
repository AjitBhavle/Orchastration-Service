
import java.util.Scanner;

public class OddNumFromGivenNum {

	public static void main(String arg[]) {

		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		num=num*2;
		int num1=num/2;
		System.out.println("Middle Number: "+num1 );
		while(num!=0) {
			if(num%2!=0) {
				System.out.println("Odd Number: "+num );
			}
			num--;
		}
		
	}

}
