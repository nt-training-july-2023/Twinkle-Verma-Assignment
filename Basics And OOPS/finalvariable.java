package question9;

public class finalvariable {
	final int range=90;//final variable  
	 void show()
	 {  
	  //range=40;  cannot change the final variable
	 }  
	 public static void main(String args[]){  
		 finalvariable fv=new  finalvariable();  
	 fv.show();  
	 }  
}
