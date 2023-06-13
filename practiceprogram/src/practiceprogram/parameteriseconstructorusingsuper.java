package practiceprogram;

class http
{
	
	http(int a)
	{
		System.out.println("parent class constructor:" +a);
	}
}
class ftp extends http
{
	ftp(int a)
	{
		super(100); // in case of default constructor super()
		System.out.println("base class constructor:" +a);
	}
	
}

public class parameteriseconstructorusingsuper {
	
	public static void main(String[] args) {
		
		ftp f1=new ftp(50);
	}

}
