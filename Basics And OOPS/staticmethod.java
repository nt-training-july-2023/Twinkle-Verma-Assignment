package question9;

public class staticmethod {
	static int num = 100;
    static String str = "Twinkle";
  
    // This is Static method
    static void display()
    {
        System.out.println("static number is " + num);
        System.out.println("static string is " + str);
    }
  
    // non-static method
    void nonstatic()
    {
        // our static method can accessed 
        // in non static method
        display();
    }
  
    // main method
    public static void main(String args[])
    {
        staticmethod obj = new staticmethod();
obj.nonstatic();
        
        // static method can called 
        // directly without an object
        display();
}
}
