package practiceprogram;

import java.util.Scanner;

class fie
{
	int a;
	void show()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE OF A:");
		a=sc.nextInt();
		System.out.println("A:" +a);
		
	}
	
}
class fiee extends fie
{
	int b;
	void show()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE OF B:");
		b=sc.nextInt();
		System.out.println("B:" +b);
	}
}
public class methodoveridding {
	
	public static void main(String[] args) {
		
		fiee f=new fiee();
		f.show();
	}

}
