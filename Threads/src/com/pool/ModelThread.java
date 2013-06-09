package com.pool;

public class ModelThread extends Thread{
	public synchronized void goTowait()
	{
		try
		{
	//		System.out.println("jdf");
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
public synchronized void release()
{
	notify();
	
}
public void run()
{
	while(true)
	{
		goTowait();
		for(int i=0;i<10;i++)
		{
			System.out.println(getName()+":"+i);
			Util.sleep(1000);
		}
		release();
	}
}
}
