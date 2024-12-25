package com.stocktrading.controller;
import com.stocktrading.model.TradeRequest;
import com.stocktrading.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@RequestMapping("/api")

public class StockController {
	
	
	
      @Autowired
      private StockService stockService;
      
      
      @PostMapping("/trade")
      public Map<String, Object>trade(@RequestBody TradeRequest request){
    	  return stockService.processTrade(request);
      }
 
}
