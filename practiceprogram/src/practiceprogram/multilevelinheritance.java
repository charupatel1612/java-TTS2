package practiceprogram;

import java.util.Scanner;

class A11
{
	int a,b,sum=0;
	void getA()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE A:");
		a=sc.nextInt();
		
	}
	void putA()
	{
		System.out.println("A:" +a);
	}
	
}
class B11 extends A11
{
	
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE B:");
		b=sc.nextInt();
		
	}
	void putB()
	{
		System.out.println("B:" +b);
	}
}
class C11 extends B11
{
	int sum=a+b; 
	void getC()
	{
		System.out.println("SUM:" +sum);
	}
	void putC()
	{
		System.out.println("SUM:" +sum);
	}
	
}


public class multilevelinheritance {
	
	public static void main(String[] args) {
		
		C11 c=new C11();
		B11 b=new B11();
		b.getA();
		b.putA();
		b.getB();
		b.putB();
		c.getC();
		c.putC();
		
		
		
	}

}
