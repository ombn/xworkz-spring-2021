package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;

public class SharanaTester {
	
	public static void main(String[] args) {
		
		FoodItemEntity entity=new FoodItemEntity("Veg Biryani", 120, FoodType.SOUTHINDIAN, 01,0);
		
		
		FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
		//entity is not valid
		itemRepository.save(entity);
		
		
		
	}

}
