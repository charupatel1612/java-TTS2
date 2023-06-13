package practiceprogram;

import java.util.Scanner;

class demo
{
	int a,b;
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		a=sc.nextInt();
		System.out.println("Enter value of B:");
		b=sc.nextInt();
		System.out.println("SUM:" +(a+b));
		System.out.println("default constructor");
	}
	void show()
	{
		System.out.println("A:" + a);
		System.out.println("B:" +b);
		System.out.println("SUM :" +(a+b));
		
	}
	
	demo(demo obj)
	{
		System.out.println("copy constructor");
		a=obj.a;
		b=obj.b;
		
	}
	
}
public class constructor2 {

	public static void main(String[] args) {
		
		demo a1=new demo();
		a1.show();
		demo a2=new demo(a1);
		a2.show();
		
		
	}
}
