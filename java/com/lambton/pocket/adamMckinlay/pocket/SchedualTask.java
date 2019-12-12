package com.lambton.pocket.adamMckinlay.pocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedualTask {
	@Autowired
	private PageCounter pageCounter;
	
	@Scheduled(fixedRate = 3000)
	public void reportPageHits(){
		System.out.println("Total number of hits: " + pageCounter.getPageCount());
	}
}
