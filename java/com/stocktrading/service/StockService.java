package com.stocktrading.service;
import com.stocktrading.model.TradeRequest;
import com.stocktrading.model.PortfolioItem;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class StockService {
	public Map<String, Object>processTrade(TradeRequest request){
		List<PortfolioItem>portfolio=updatePortfolio(request);
		Map<String, Object>response=new HashMap<>();
		response.put("portfolio",portfolio);
		return response;
		
		
	}

	private List<PortfolioItem> updatePortfolio(TradeRequest request) {
		// TODO Auto-generated method stub
		return List.of(new PortfolioItem("AAPL",10,150.00));
	}

	}


