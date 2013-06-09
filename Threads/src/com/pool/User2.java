package com.pool;

public class User2 extends Thread{
	ThreadPoolManager pm=null;
	User2(ThreadPoolManager pm)
	{
		this.pm=pm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread th=pm.getThread();
		//	System.out.println("krishna");
			th.release();
			th.goTowait();
			pm.setThread();
			Util.sleep(1000);
		}
	}

}
