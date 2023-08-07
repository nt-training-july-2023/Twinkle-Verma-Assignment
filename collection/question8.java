package collection;

public abstract class question8 implements Comparable<question8> {
	private int twi;
	
public int compareto(question8 val)
{
	return Integer.compare(this.twi, val.twi);
}
}
