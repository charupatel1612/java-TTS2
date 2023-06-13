package practiceprogram;

class fi
{
	void show()
	{
		System.out.println("method without parameter");
	}
	
	void show(int a,int b)
	{
		System.out.println("sum:" +(a+b));
	}
	
	void show(int a, int b, int c)
	{
		System.out.println("sum:" +(a+b+c));
	}
	
}

public class methodoverloading {
	
	public static void main(String[] args) {
		
		fi f=new fi();
		f.show(10,20);
		f.show();
		f.show(10,5,5);
	}

}
