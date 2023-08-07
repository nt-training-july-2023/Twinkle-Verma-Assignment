package fifth;
abstract class twinkle
{
	abstract void shine();
	
}
class humanbeing extends twinkle
{
	void shine()
	{
		System.out.println("shine like twinkle");
	}
	
}
public class abstract1 {
	public static void main(String[] args)
	{
		twinkle tin=new humanbeing();
		tin.shine();
	}

}

