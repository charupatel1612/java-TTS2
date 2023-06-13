package practiceprogram;

class A1
{
	A1()
	{
		System.out.println("default constructor of A class");
	}
	void show()
	{
		System.out.println("super class");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("default constructor of B class");
	}
	void show()
	{
		
		System.out.println("sub class extends with super class A");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("default constructor of C class");
	}
	void show()
	{
		
		System.out.println("sub class extends with sub class B");
	}
}
public class constructorchanning {
	
	public static void main(String[] args) {
		
		C1 c=new C1();
		c.show();
		
	}

}
