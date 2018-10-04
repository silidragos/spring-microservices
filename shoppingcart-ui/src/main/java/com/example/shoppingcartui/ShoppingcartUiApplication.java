package com.example.shoppingcartui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.shoppingcartui.filters.AuthHeadFilter;

//Should be able to call GET api/catalog/api/products
@EnableZuulProxy
@SpringBootApplication
public class ShoppingcartUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartUiApplication.class, args);
	}
	
	@Bean
	AuthHeadFilter authHeaderFilter() {
	    return new AuthHeadFilter();
	}
}
