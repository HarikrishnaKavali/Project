package com.pool;

public class Test extends AbstractAndInterfaceDiff{

	
	public  void test()
	{
		System.out.println("hello world");
	}
	public void test1()
	{
			System.out.println("welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractAndInterfaceDiff test=new AbstractAndInterfaceDiff() {
			
			@Override
			public void test() {
				
				System.out.println("i am in inner type");
				// TODO Auto-generated method stub
			
			}
		};
		test.test();
	}

}
