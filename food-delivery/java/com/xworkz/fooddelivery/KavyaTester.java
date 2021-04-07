package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;

public class KavyaTester {

	public static void main(String[] args) {

		
		FoodItemEntity entity=new FoodItemEntity("Veg Biryani", 120, FoodType.SOUTHINDIAN, 01,0);
		
		FoodItemRepository foodItemRepository=new FoodItemRepositoryImpl();
		
		FoodItemService foodItemService=new FoodItemServiceImpl(foodItemRepository);
		
		
		
		foodItemService.validateAndSave(entity);
		
	
	}

}
