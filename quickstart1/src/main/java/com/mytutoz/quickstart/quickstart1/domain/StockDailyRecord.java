package com.mytutoz.quickstart.quickstart1.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "stock_daily_record", catalog = "test1", 
uniqueConstraints = @UniqueConstraint(columnNames = "DATE"))
public class StockDailyRecord implements java.io.Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer recordId;
	private Stock stock;
	private Float priceOpen;
	private Float priceClose;
	private Float priceChange;
	private Long volume;
	private Date date;
 
	public StockDailyRecord() {
	}
 
	public StockDailyRecord(Stock stock, Date date) {
		this.stock = stock;
		this.date = date;
	}
 
	public StockDailyRecord(Stock stock, Float priceOpen, Float priceClose,
			Float priceChange, Long volume, Date date) {
		this.stock = stock;
		this.priceOpen = priceOpen;
		this.priceClose = priceClose;
		this.priceChange = priceChange;
		this.volume = volume;
		this.date = date;
	}
 
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RECORD_ID", unique = true, nullable = false)
	public Integer getRecordId() {
		return this.recordId;
	}
 
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STOCK_ID", nullable = false)
	public Stock getStock() {
		return this.stock;
	}
 
	public void setStock(Stock stock) {
		this.stock = stock;
	}
 
	@Column(name = "PRICE_OPEN", precision = 6)
	public Float getPriceOpen() {
		return this.priceOpen;
	}
 
	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}
 
	@Column(name = "PRICE_CLOSE", precision = 6)
	public Float getPriceClose() {
		return this.priceClose;
	}
 
	public void setPriceClose(Float priceClose) {
		this.priceClose = priceClose;
	}
 
	@Column(name = "PRICE_CHANGE", precision = 6)
	public Float getPriceChange() {
		return this.priceChange;
	}
 
	public void setPriceChange(Float priceChange) {
		this.priceChange = priceChange;
	}
 
	@Column(name = "VOLUME")
	public Long getVolume() {
		return this.volume;
	}
 
	public void setVolume(Long volume) {
		this.volume = volume;
	}
 
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE", unique = true, nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}
 
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((priceChange == null) ? 0 : priceChange.hashCode());
		result = prime * result
				+ ((priceClose == null) ? 0 : priceClose.hashCode());
		result = prime * result
				+ ((priceOpen == null) ? 0 : priceOpen.hashCode());
		result = prime * result
				+ ((recordId == null) ? 0 : recordId.hashCode());
		result = prime * result + ((stock == null) ? 0 : stock.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockDailyRecord other = (StockDailyRecord) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (priceChange == null) {
			if (other.priceChange != null)
				return false;
		} else if (!priceChange.equals(other.priceChange))
			return false;
		if (priceClose == null) {
			if (other.priceClose != null)
				return false;
		} else if (!priceClose.equals(other.priceClose))
			return false;
		if (priceOpen == null) {
			if (other.priceOpen != null)
				return false;
		} else if (!priceOpen.equals(other.priceOpen))
			return false;
		if (recordId == null) {
			if (other.recordId != null)
				return false;
		} else if (!recordId.equals(other.recordId))
			return false;
		if (stock == null) {
			if (other.stock != null)
				return false;
		} else if (!stock.equals(other.stock))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}
	
	
	
	
 
}
