package com.xworkz.fooddelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.service.FoodItemService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml");
		//ac-->file.xml-->parse-->repo, service
				
		//container.getBean("foodItemServiceImpl",Object.class);
		FoodItemService service=container.getBean(FoodItemService.class);		
		FoodItemEntity entity=new FoodItemEntity("Masala Dosa", 120, FoodType.SOUTHINDIAN, 01,0);
		service.validateAndSave(entity);
		
	}

}
