package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save in FoodItemRepositoryImpl" + entity);
		System.out.println("should save into db using JPA");

	}

}
