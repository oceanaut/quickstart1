package com.mytutoz.quickstart.quickstart1.domain;

import java.util.List;

import com.mytutoz.quickstart.quickstart1.domain.Stock;
import com.mytutoz.quickstart.quickstart1.domain.StockDailyRecord;

public interface IStockService {
	
	    //public void addStock(Stock stock,StockDailyRecord stockDailyRecords);  
		public void addStock(Stock stock);
		//public List<Stock> findAll();
}
