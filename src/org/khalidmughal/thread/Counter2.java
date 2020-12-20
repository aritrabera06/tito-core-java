package org.khalidmughal.thread;

public class Counter2 extends Thread
{

		private int currentValue;
		public Counter2(String threadName) 
		{
			super(threadName); //call to constructor of the super class Thread
			currentValue = 0;
			System.out.println("from constructor - the thread : " + this);
			start();
		}
		
		public int getValue(){ return currentValue;}
		
		public void run()
		{
			try
			{
				while(currentValue < 5)
				{
					System.out.println(getName() + " : " + (currentValue++));
					//setDaemon(true);
					Thread.sleep(250);
				}
			}
			catch(InterruptedException e)
			{
				System.out.println(getName() + " interrupted.");
			}
			System.out.println("Exit from thread : " + getName());
		}
	
} // End of class Counter2
