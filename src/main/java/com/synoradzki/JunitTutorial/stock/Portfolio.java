package com.synoradzki.JunitTutorial.stock;

public class Portfolio {

	public String delegate(MarketWatcher mWatcher, int value, String msg) {
		String quate = mWatcher.getQuote(msg);
		return quate + " " + value;
	}
}
