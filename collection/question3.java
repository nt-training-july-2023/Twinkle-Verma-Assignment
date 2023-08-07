//Update elements of list by 5 whenever there is an element
//greater than 50 is encountered.
package collection;

import java.util.ArrayList;

public class question3 {
public static void main(String[] args)
{
	ArrayList<Integer> ic= new ArrayList<>();
	ic.add(30);
	ic.add(70);
	ic.add(60);
	ic.add(80);
	ic.add(90);
	for(int i=0;i<ic.size();i++)
	{
		int no =ic.get(i);
		if(no>50)
		{
			ic.set(i, no+5);
		}
		if(no<50)
		{
			ic.set(i, no-5);
			
		}
	}
	System.out.println("updated:"+ic);
}
}
