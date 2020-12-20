package org.khalidmughal.thread;

/** 
 *  
 */

public class Counter implements Runnable 
{
	private int currentValue;
	private Thread workerThread;
	
	public Counter(String threadName) 
	{
		currentValue = 0;
		workerThread = new Thread(this,threadName);
		System.out.println("from constructor - workerThread : " + workerThread);
		workerThread.start();
	}
	
	public int getValue(){ return currentValue;}
	
	public void run()
	{
		try
		{
			while(currentValue < 5)
			{
				System.out.println(workerThread.getName() + " : " + (currentValue++));
				Thread.sleep(250);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(workerThread.getName() + " interrupted.");
		}
		System.out.println("Exit from thread : " + workerThread.getName());
	}
} // End of Counter class
