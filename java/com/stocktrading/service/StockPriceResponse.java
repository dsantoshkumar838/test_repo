package com.stocktrading.service;
import java.util.Map;

public class StockPriceResponse {
	private Map<String, Map<String, String>>timeSeries;
	public Map<String, Map<String, String>>getTimeSeries(){
		return timeSeries;
	}
	public void setTimeseries(Map<String,Map<String, String>>timeSeries) {
		this.timeSeries=timeSeries;
	}

}
