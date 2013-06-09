package com.pool;

public class User3 extends Thread{
	ThreadPoolManager pm=null;
	User3(ThreadPoolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread th=pm.getThread();
		//	System.out.println("krish");
			th.release();
			th.goTowait();
			pm.setThread();
			Util.sleep(1000);
		}
	}

}
