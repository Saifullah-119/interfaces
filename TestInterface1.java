interface Drawable
{
	void draw();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<20;j++)
			{
				if((i==0||i==4)||(j==0||j==19))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("O");
	}
}
public class TestInterface1
{
	public static void main(String[] uments)
	{
		Rectangle rec= new Rectangle();
		Circle cir= new Circle();
		rec.draw();
		cir.draw();
	}
}
/*interface printable
{
	void print();
}
class Abc implements printable
{
	public void print()
	{
		System.out.println("File Edit Search VIew Encoding Language Settings Tools Macro Run Plugins Window ?");
	}
}
public class MainInterRA
{
	public static void main(String[] uments)
	{
		Abc abc=new Abc();
		abc.print();
	}
}*/