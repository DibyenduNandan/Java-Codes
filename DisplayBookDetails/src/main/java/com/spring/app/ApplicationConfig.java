package com.spring.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//fill the code

@Configuration
@ComponentScan({"com.spring.app"})

public class ApplicationConfig {
	
//	@Bean("Orderobj")
//	public Order getOrder()
//	{
//		
//		
//		Order obj=new Order();
//		obj.setQuantity(2);
//		return obj;
//	}

}
