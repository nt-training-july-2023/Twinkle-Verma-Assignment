//Create a Integer collection and store 20 elements in it//
package collection;

import java.util.ArrayList;

public class question1 {
public static void main(String[] args)
{
	ArrayList<Integer> ic= new ArrayList<>();
	for(int i=1;i<=20;i++)
	{
		ic.add(i);
	}
	System.out.println("Enter integer"+ic);
}
}
