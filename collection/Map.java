package collection;
import java.util.HashMap;
import java.util.Iterator;

public class Map {
public static void main(String[] args)
{
	HashMap<Integer,String> tw=new HashMap<>();
	tw.put(11, "Twinkle");
	tw.put(12, "Gunjan");
	tw.put(13,"Ayushi");
	Iterator <Integer> it = tw.keySet().iterator();       //keyset is a method  
	
	while(it.hasNext())  
	{  
	int key=(int)it.next();  
	System.out.println("EmployId.: "+key+"     name: "+tw.get(key));
	
	
}
}
}