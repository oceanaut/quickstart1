package com.mytutoz.quickstart.quickstart1.domain;

import org.springframework.stereotype.Component;


@Component	
public class StockService implements IStockService {
	
	private StockDao stockDao;

	public StockDao getStockDao() {
		return stockDao;
	}

	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}
	
	public void addStock(Stock stock) {
        getStockDao().save(stock);
		
    }

}
