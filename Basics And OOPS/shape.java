package polymorphism;

public class shape {
		public void area(String Circle)
		{
			System.out.println("Circle");
	}
		public void area(String Circle,String Traingle)
		{
			System.out.println("Circle and Traingle");
		}
		public void area(String Circle,String Traingle,String rectangle)
		{
			System.out.println("Circle and Traingle and rectangle");
	}
		public static void main(String[] args)
		{
			shape s= new shape();
			s.area("Circle");
			s.area("Circle","Traingle");
			s.area("Circle","Traingle","rectangle");
		
	}
	
}
