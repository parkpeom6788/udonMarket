package org.kosta.udonmarket.model;

public class MarketVO extends  MemberVO {
	private static final long serialVersionUID = -5204290460873140792L;
	private String marketNo;
	private String marketName;
	private String marketTel;
	private String info;
	private String item;
	
	public MarketVO() {
		super();
	}
	public MarketVO(String marketNo, String marketName, String marketTel, String info, String item) {
		super();
		this.marketNo = marketNo;
		this.marketName = marketName;
		this.marketTel = marketTel;
		this.info = info;
		this.item = item;
	}
	public String getMarketNo() {
		return marketNo;
	}
	public void setMarketNo(String marketNo) {
		this.marketNo = marketNo;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getMarketTel() {
		return marketTel;
	}
	public void setMarketTel(String marketTel) {
		this.marketTel = marketTel;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "MarketVO [marketNo=" + marketNo + ", marketName=" + marketName + ", marketTel=" + marketTel + ", info="
				+ info + ", item=" + item + "]";
	}
}
