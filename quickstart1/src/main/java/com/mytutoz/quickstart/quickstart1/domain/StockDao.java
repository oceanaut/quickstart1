package com.mytutoz.quickstart.quickstart1.domain;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public class StockDao implements IStockDAO{
	

	private SessionFactory sessionFactory;
	 
  
    public void save(Stock stock) {
    	 Session session = sessionFactory.getCurrentSession();    
         session.save(stock);
        
    }
    
    
    @Override
    public List<Stock> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return (List<Stock>)session.createQuery("from stock").list();
    }


	@Override
	public void save(StockDailyRecord stockDailyRecords) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
	     session.save(stockDailyRecords);
        
		
	}
    
}
