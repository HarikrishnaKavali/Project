package com.pool;

import java.util.ArrayList;

public class ThreadPoolManager {
	private ArrayList pool = new ArrayList();

	public void init() {
		ModelThread th = null;
		for(int i=0;i<10;i++)
		{
			th=new ModelThread();
			th.start();
			pool.add(th);
		}
	}
	public ModelThread getThread()
	{
		ModelThread th=null;
		if(pool.size()>0)
		{
			th=(ModelThread) pool.remove(0);
			
		}
		else
		{
			th=new ModelThread();
			th.start();
		}
		return th;
	}
	public void setThread()
	{
		ModelThread th=null;
		if(pool.size()<10)
		{
			
		}
		else
		{
			th.stop();
			th=null;
		}
	}
	public void release()
	{
		ModelThread th=null;
		for(int i=0;i<pool.size();)
		{
			th=(ModelThread)pool.remove(0)	;
			th.stop();
		}
	}
}
