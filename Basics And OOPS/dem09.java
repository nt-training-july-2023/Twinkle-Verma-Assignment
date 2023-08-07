package question9;

public class dem09 {
static int count=0;
public void sum()
{
	count++;
}
public static void main(String[] args)
{
	dem09 dm1=new dem09();
	dem09 dm2=new dem09();
	dm1.sum();
	dm2.sum();
	System.out.print("dm1: count="+dm1.count);
	System.out.print("dm1: count="+dm2.count);
	}
}

