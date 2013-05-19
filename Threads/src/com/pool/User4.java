package com.pool;

public class User4 extends Thread {
	ThreadPoolManager pm=null;
	User4(ThreadPoolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread th=pm.getThread();
			th.release();
			System.out.println("hari");
			th.goTowait();
			pm.setThread();
			Util.sleep(1000);
		}
	}
}
