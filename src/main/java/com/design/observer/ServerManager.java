package com.design.observer;

import java.util.Observable;

/**
 * 被观察者
 * @author  xujiahui
 * @create  2018年12月20日
 */
public class ServerManager extends Observable{

	private int data = 0;

	public int getData() {
		return data;
	}
	
	public void setDate(int i) {
		if (this.data != i) {
			this.data = i;
//			setChanged();
		}
		notifyObservers();
	}
}
