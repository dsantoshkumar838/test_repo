package com.stocktrading.model;

public class PortfolioItem {
	private String symbol;
	private int quantity;
	private double price;
	
	
	public PortfolioItem(String symbol,int quantity,double price) {
		this.symbol=symbol;
		this.quantity=quantity;
		this.price=price;
		
	}

}
