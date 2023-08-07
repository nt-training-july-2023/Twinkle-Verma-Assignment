//Display elements of in reverse order without using for loop
package collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collection;

public class question2 {
public static void main(String[] args)
{
	ArrayList<Integer> ic=new ArrayList<>();
	for(int i=1;i<=20;i++)
	{
		ic.add(i);
	}
		Collections.reverse(ic);
		System.out.println("Reverse Integer:"+ic);
	}
}
