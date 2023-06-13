package practiceprogram;

class AB
{
	int a=10;
	
}
class AC extends AB
{
	int a=20;
	void show()
	{
		System.out.println("Base class variable value:" +super.a);
		System.out.println("child class variable value:" +a);
		
	}
	
}

public class superclassusingvariable {
	
	public static void main(String[] args) {
		
		AC a1=new AC();
		a1.show();
	}

}
