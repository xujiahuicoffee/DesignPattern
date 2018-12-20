package com.design.observer;

import java.util.Observable;
import java.util.Observer;

public class BObserver implements Observer{
	
	public BObserver(ServerManager sm) {
	     super();
	     sm.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		 System.out.println("BObserver receive:Data has changed to "+((ServerManager) o).getData());
	}

}
