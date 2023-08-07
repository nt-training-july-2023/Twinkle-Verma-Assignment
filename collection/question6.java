//Elements stored should not be repeated.
package collection;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.LinkedHashSet;
public class question6 
{
public static void main(String[] args)
{
LinkedHashSet<String> ic =new LinkedHashSet<>();
	ic.add("twinkle");
	ic.add("gunjan");
	ic.add("ayushi");
	ic.add("sachin");
	ic.add("adarsh");
	ic.add("ayush");
	ic.add("sajal");
	ic.add("tinku");
	ic.add("tinku");
	ic.add("tinku");
	ic.add("tinku");
	ic.add("tinku");
	ic.add("tinku");
	ArrayList<String> sc=new ArrayList<>(ic);
	System.out.println("String Collection:"+sc);	
}
}
