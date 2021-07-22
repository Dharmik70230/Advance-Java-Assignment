package com.phoenix.inner;

public class OuterML {

	
	public void test() {
		
		class Inner{
			private int x ;
			public Inner() {
				// TODO Auto-generated constructor stub
				x = 7222;
			}
			public Inner(int x) {
				// TODO Auto-generated constructor stub
				super();
				this.x =x;	
			}
			public void show() {
				System.out.println("x : " + x);
			}
			
		}
		Inner in = new Inner();
		in.show();
	}
}
