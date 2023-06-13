package practiceprogram;

class integer
{
	void show(int n,char c)
	{
		System.out.println("VALUE OF INTEGER:" +n+ "VALUE OF CHARACTER:" +c);
	}
	 
	 void display(char c,int n)
	{
		System.out.println("VALUE OF CHARACTER:" +c+ "VALUE OF INTEGER:" +n);
	}
}

public class integer_character_function {
	
	public static void main(String[] args) {
		
		integer i=new integer();
		i.show(10,"t");
		i.display("c", 10);
		
		
	}

}
