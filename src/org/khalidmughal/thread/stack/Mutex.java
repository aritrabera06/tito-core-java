package org.khalidmughal.thread.stack;

public class Mutex 
{
	public static void main(String args[])
	{
		final StackImpl stack = new StackImpl(20);
		
		// thread 1
		( new Thread("Pusher")
		  {
		     public void run()
		     {
		    	 for(;;)
		    	 {
		    		 //System.out.println("Pushed : " + stack.push(new Integer(2003)) );
		    		 System.out.println("Pushed : " + stack.push(2003)); // autoboxing
		    	 }
		     }
		  }
	     ).start();
		
		// thread 2
		( new Thread("Popper")
		  {
				public void run()
				{
					for(;;)
					{
						System.out.println("Popped : " + stack.pop());
					}
				}
		  }
		).start();
		
		System.out.println("Exit from main() method....");
		
	} // End of method main()
} // End of class Mutex
