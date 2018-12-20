package com.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 
 * @author xujiahui
 * @create 2018年12月20日
 */
public class AObserver implements Observer {

	public AObserver(ServerManager sm) {
		super();
	    sm.addObserver(this); 
	}

	@Override
	public void update(Observable o, Object arg) {
		 System.out.println("AObserver receive:Data has changed to "+((ServerManager) o).getData());
	}

}
