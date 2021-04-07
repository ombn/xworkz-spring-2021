package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {
	// Obj's more than once , if a service is created
	// Tight Coupled
	private FoodItemRepository itemRepository;

	public FoodItemServiceImpl(FoodItemRepository itemRepository) {
		System.out.println("Created " + this.getClass().getSimpleName());
		this.itemRepository = itemRepository;
	}

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked saveAndValidate" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			// FoodItemRepository itemRepository=new FoodItemRepositoryImpl();
			itemRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}

		return false;
	}

}
