package com.mytutoz.quickstart.quickstart1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mytutoz.quickstart.quickstart1.domain.IStockDAO;
import com.mytutoz.quickstart.quickstart1.domain.Stock;
import com.mytutoz.quickstart.quickstart1.domain.StockDailyRecord;








/**
 * Hello world!
 *
 */

@Component
public class App 
{
	//@Autowired
	//	IStockService stockService;
	
	@Autowired
    private IStockDAO  stockDao;
    
		
	public void addStock() {
		
		  final String CONFIGPATH = "applicationContext.xml";
	        //ApplicationContext context = new ClassPathXmlApplicationContext(CONFIGPATH);
	        //ApplicationContext context = new ClassPathXmlApplicationContext("/quickstart1/src/main/java/applicationContext.xml");
	       // ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		  ApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIGPATH);
	        //StockService stockService = (StockService) context.getBean("stock");
	        
	        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
	        //StandaloneExample standalone = context.getBean(StandaloneExample.class);
		    
	        /*
	    	    Stock stock1 = new Stock();
	            stock1=null;
	    	    stock1.setStockCode("7052");
	            stock1.setStockName("PADINI");
	            System.out.println(stock1.getStockCode());
				stockService.addStock(stock1);
	                   
	    
	            StockDailyRecord stockDailyRecords = new StockDailyRecord();
	            stockDailyRecords.setPriceOpen(new Float("1.2"));
	            stockDailyRecords.setPriceClose(new Float("1.1"));
	            stockDailyRecords.setPriceChange(new Float("10.0"));
	            stockDailyRecords.setVolume(3000000L);
	            stockDailyRecords.setDate(new Date());
	     
	            stockDailyRecords.setStock(stock);        
	            stock.getStockDailyRecords().add(stockDailyRecords);
		*/
	}
	

	private void startApp1() {
		
		try {
		// TODO Auto-generated method stub
		Stock stock = new Stock();
        stock.setStockName("aa");
        stock.setStockCode("ff");
        stockDao.save(stock);
		/*
        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(3000000L);
        stockDailyRecords.setDate(new Date());
        
                 
          stockDailyRecords.setStock(stock);        
          stock.getStockDailyRecords().add(stockDailyRecords);   
          stockDao.save(stockDailyRecords);
          */
		} catch (Exception e) {
			System.out.println(e);
			}
     
        
     }


	public static void main( String[] args )
    {  
    	
		final String CONFIGPATH = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIGPATH);
		App app1 = ctx.getBean(App.class);
	    app1.startApp1();
        System.out.println("Hibernate one to many (Annotation)");       
        System.out.println("Done");
    	
    }
    
       
  
 
}
