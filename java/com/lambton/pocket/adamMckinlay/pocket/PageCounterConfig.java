package com.lambton.pocket.adamMckinlay.pocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageCounterConfig {
	@Bean
	public PageCounter getPageCount(){
		return new PageCounter();
	}
}
