package com.design.observer;

public class TestDemo {

	public static void main(String[] args) {
		
		ServerManager sm = new ServerManager();
		AObserver ao = new AObserver(sm);
		BObserver bo = new BObserver(sm);
		sm.setDate(66);
	}

}
