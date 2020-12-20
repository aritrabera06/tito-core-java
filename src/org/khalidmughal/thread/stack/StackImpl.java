package org.khalidmughal.thread.stack;

public class StackImpl 
{
	
	private Object[] stackArray;
	private int topOfStack;
	
	public StackImpl(int capacity) 
	{
		stackArray = new Object[capacity];
		topOfStack = -1;
	}
    
	public boolean push(Object element)
	//public synchronized boolean push(Object element)
	{
		if(isFull())
		{
			return false;
		}
		++topOfStack;
		try
		{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		stackArray[topOfStack] = element;
		return true;
	}
	
	public Object pop()
	//public synchronized Object pop()
	{
		if(isEmpty())
		{
			return null;
		}
		Object obj = stackArray[topOfStack];
		stackArray[topOfStack] = null;
		try
		{
			Thread.sleep(1000);
		}catch(Exception e){
			//
			e.printStackTrace();
		}
		topOfStack--;
		return obj;
	}
	
	public boolean isEmpty()
	{
		return topOfStack < 0;
	}
	public boolean isFull()
	{
		return topOfStack >= stackArray.length - 1;
	}
} // End of class StackImpl
