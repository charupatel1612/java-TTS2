package practiceprogram;

class parent
{
	void show()
	{
		
		System.out.println("show method of parents class");
	}
}
class base extends parent
{
	void show()
	{
		super.show();
		System.out.println("show method of base class");
		
	}
}


public class callingsuperclassmethod {
	
	public static void main(String[] args) {
		
		base b1=new base();
		b1.show();
	}

}
