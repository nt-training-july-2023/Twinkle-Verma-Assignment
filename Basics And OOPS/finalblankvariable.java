package question9;

public class finalblankvariable
{
	final public int i;
	 
	finalblankvariable(int val)   
	{  
    	this.i = val; 
    	}
 
	finalblankvariable()
    {
        // Calling Test(int val)
        this(10);
    }
 
    public static void main(String[] args)
    {
        finalblankvariable t1 = new finalblankvariable();
        System.out.println(t1.i);
 
        finalblankvariable t2 = new finalblankvariable(20);
        System.out.println(t2.i);
    }
}

