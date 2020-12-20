package org.khalidmughal.thread;

public class CounterClient2 
{
	public static void main(String[] args) 
	{
		System.out.println("Method main() runs in thread : " + Thread.currentThread().getName());
		
		Counter counterA = new Counter("Counter A");
		Counter counterB = new Counter("Counter B");
		
		System.out.println("Exit from main() method.");
	}
}
