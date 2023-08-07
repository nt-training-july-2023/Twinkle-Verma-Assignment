package inheritance;
class twinkle
{
	void play()
	{
		System.out.println("Basket ball");
	}
}//single
class payal extends twinkle
{
	void sing()
	{
		System.out.println("sa re ga ma pa");
	}
}//multiple
interface dancing{
	void dance();
}
interface crying
{
	void cry();
}
class ram implements dancing,crying
{
	public void dance()
	{
		System.out.println("ram can dance");
	}
	public void cry()
	{
		System.out.println("ram can cry");
	}
}
//multilevel
class shape
{
	void draw()
	{
		System.out.println("shape");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("draw");
	}
}
	class traingle extends circle
	{
		void trai()
		{
			System.out.println("trai");
		}
}
public class human 
	{
	public static void main(String[] args)
	{
		payal py= new payal();
		py.sing();
		ram rm=new ram();
		rm.dance();
		rm.cry();
		traingle tr=new traingle();
		tr.trai();
	}
}

