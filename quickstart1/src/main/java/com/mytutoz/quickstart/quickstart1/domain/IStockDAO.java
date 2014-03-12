package com.mytutoz.quickstart.quickstart1.domain;

import java.util.List;

import com.mytutoz.quickstart.quickstart1.domain.Stock;
import com.mytutoz.quickstart.quickstart1.domain.StockDailyRecord;

public interface IStockDAO {

	//public void addStock(Stock stock,StockDailyRecord stockDailyRecords);  
	 public void save(Stock stock);
	 public List findAll();
	 public void save(StockDailyRecord stockDailyRecords);
}
