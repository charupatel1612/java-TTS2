package practiceprogram;

import java.util.Scanner;

class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE OF A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A:" +a);
	}

}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE OF B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B:" +b);
	}
}
class C extends A
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE OF C:");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C:" +c);
	}
}
public class hierarchyinheritance {
	
	public static void main(String[] args) {
		
		C c1=new C();
		B b1=new B();
		c1.getC();
		c1.putC();
		b1.getB();
		b1.putB();
		c1.getA();
		c1.putA();
		
		
	}
}
