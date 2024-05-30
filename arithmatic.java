package day1;
import java.util.Scanner;

public class arithmatic {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Add:"+c);
		c=a-b;
		System.out.println("Substract:"+c);
		c=a*b;
		System.out.println("Mul:"+c);
		c=a/b;
		System.out.println("Division:"+c);
		

	}

}
