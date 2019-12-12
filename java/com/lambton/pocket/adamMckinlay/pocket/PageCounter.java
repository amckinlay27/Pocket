package com.lambton.pocket.adamMckinlay.pocket;

public class PageCounter {
	private Integer pageCount;
	
	public PageCounter(){
		this.pageCount = 0;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	
	public void increment(){
		this.pageCount++;
	}
}
