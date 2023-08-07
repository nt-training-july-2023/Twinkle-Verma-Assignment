package encapsulation;
 class Employee {
	private String name;
	public void setName(String name)
	{
	this.name=name;
	}
	public String getName()
	{
		return name;
	}
 }
	public class encapsulation1
	{
public static void main(String[] args)
{
Employee e	=new Employee();
e.setName("Twinkle");
System.out.println("Name Is:"+e.getName());
}
}

