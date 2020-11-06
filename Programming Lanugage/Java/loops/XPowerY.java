package loops;
import java.util.Scanner;
public class XPowerY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,result=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X and Y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i=0; i<y; i++)
			result *= x;
		
		System.out.println("X power Y "+result);
	}

}
