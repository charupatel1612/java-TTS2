package practiceprogram;

import java.util.Scanner;

class a
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A:" +a);
	}
}
class b extends a
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B:" +b);
		System.out.println("sum:" +(a+b));
	}
}

public class simpleinheritance {
	
	public static void main(String[] args)
	{
		B ref=new B();
		ref.getA();
		ref.getB();
		ref.putA();
		ref.putB();
		
		
	}

}
