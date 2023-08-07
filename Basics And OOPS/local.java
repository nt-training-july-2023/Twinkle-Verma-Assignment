package nested;

public class local {
	//member inner class
class  memberinner
{
	public void show()
	{
		System.out.println("this is a memberinner class");
}
	//static
	static class staticnested
	{
		public void show() {
			System.out.println("this is static nested");
		}
	}
	public void demonstrateLocalInner()
	{
		class localinner{
			public void show()
			{
				System.out.println("this is localinner");
			}
		}
	
	localinner li=new localinner();
	li.show();
	}
	public void demonstrateAnonymousInner()
	{
		Runnable run=new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("this is anonymousinner");
			}
		};
		new Thread(run).start();
	}
	public static void main(String[] args)
	{
		local lc=new local();
		memberinner mi=lc.new memberinner();
		mi.show();
		staticnested sn=new staticnested();
		sn.show();
		
		
	}
}
}


	
	
