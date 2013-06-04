package com.pool;

public class Manager {
public static void main(String[] args) {
	ThreadPoolManager pm=new ThreadPoolManager();
	pm.init();
	User1 u1=new User1(pm);
	User2 u2=new User2(pm);
	User3 u3=new User3(pm);
	User3 u4=new User3(pm);
	u1.start();
	u2.start();
	u3.start();
	u4.start();
	Util.sleep(50000);
//	u1.stop();
//	u2.stop();
//	u3.stop();
	pm.release();
	System.out.println("End the Game");
}
}
