package question9;
	class OuterClass {
		 
	    
	    private static String s1 = "Twinkle Verma";
	 
	    public static class NestedStaticClass {
	 
	        
	        public void printMessage()
	        {
	 
	            
	            System.out.println("Message from nested static class: " + s1);
	        }
	    }
	 
	    
	    public class InnerClass {
	        public void display()
	        {
	            System.out.println(
	                "Message from non-static nested class: "
	                + s1);
	        }
	    }
	}
	 
	// Class 2
	// Main class
	class  staticclass  {
	 
	    // Main driver method
	    public static void main(String args[])
	    {
	 
	        // Creating instance of nested Static class
	        // inside main() method
	        OuterClass.NestedStaticClass printer
	            = new OuterClass.NestedStaticClass();
	 
	        // Calling non-static method of nested
	        // static class
	        printer.printMessage();
	 
	        // Note: In order to create instance of Inner class
	        //  we need an Outer class instance
	 
	        // Creating Outer class instance for creating
	        // non-static nested class
	        OuterClass outer = new OuterClass();
	        OuterClass.InnerClass inner
	            = outer.new InnerClass();
	 
	        // Calling non-static method of Inner class
	        inner.display();
	 
	        // We can also combine above steps in one
	        // step to create instance of Inner class
	        OuterClass.InnerClass innerObject
	            = new OuterClass().new InnerClass();
	 
	        // Similarly calling inner class defined method
	        innerObject.display();
	    }
	}

	
