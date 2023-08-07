package question9;

public class finalmethod {
		  final void show(){
			  System.out.println("cant acess");
			  }  
		}  
		     
		class normalmethod extends finalmethod {  
		   void run(){System.out.println("final method caannot inherit");
		   }  
		     
		   public static void main(String args[])
		   {  
			 normalmethod nw= new normalmethod();  
			 nw.show();  
		   }  
		}  

