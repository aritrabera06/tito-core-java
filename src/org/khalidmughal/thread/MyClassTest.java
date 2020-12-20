package org.khalidmughal.thread;

public class MyClassTest extends Thread
{
	public MyClassTest(String s) 
	{
		msg = s;
		//start();
	}
	String msg;
	
	public void run()
	{
		System.out.println(msg);
	}
	public static void main(String[] args) 
	{
		new MyClassTest("Hello");
		new MyClassTest("World");
	}
}
