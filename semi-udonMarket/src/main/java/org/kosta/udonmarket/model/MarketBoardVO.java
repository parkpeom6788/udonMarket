package org.kosta.udonmarket.model;

public class MarketBoardVO {
	
	private long boardNo;
	private String title;
	private String content;
	private String timePosted;
	private long hits;
	private MarketVO marketVO;
	
	public MarketBoardVO(long boardNo, String title, String content, String timePosted, long hits, MarketVO marketVO) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.timePosted = timePosted;
		this.hits = hits;
		this.marketVO = marketVO;
	}

	public long getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(long boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTimePosted() {
		return timePosted;
	}

	public void setTimePosted(String timePosted) {
		this.timePosted = timePosted;
	}

	public long getHits() {
		return hits;
	}

	public void setHits(long hits) {
		this.hits = hits;
	}

	public MarketVO getMarketVO() {
		return marketVO;
	}

	public void setMarketVO(MarketVO marketVO) {
		this.marketVO = marketVO;
	}

	@Override
	public String toString() {
		return "MarketBoardVO [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", timePosted="
				+ timePosted + ", hits=" + hits + ", marketVO=" + marketVO + "]";
	}
}
