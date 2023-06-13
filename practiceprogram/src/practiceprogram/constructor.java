package practiceprogram;

class Box
{
	double width,height,depth;
	Box()
	{
		System.out.println("DEFAULT CONSTRUCTOR:");
		width=3;
		height=4;
		depth=3;
	}
	Box(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
		System.out.println("PARAMETERIZE CONSTRUCTOR:");
	}
	Box(Box b)
	{
		System.out.println("COPY CONSTRUCTOR:");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	
	void volume()
	{
		System.out.println("volume:" +(width*height*depth));
	}
	


	public static void main(String[] args)
	{
		Box b=new Box();
		b.volume();
		Box b1=new Box(4,5,6);
		b1.volume();
		Box b3=new Box(b1);
		b3.volume();
	}
}