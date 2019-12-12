package com.lambton.pocket.adamMckinlay.pocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveUserConifg {
	@Bean
	public ActiveUser logedInUser() {
		return new ActiveUser();
	}
}
