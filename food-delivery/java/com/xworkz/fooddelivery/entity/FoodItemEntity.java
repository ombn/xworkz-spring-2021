package com.xworkz.fooddelivery.entity;

import com.xworkz.fooddelivery.constants.FoodType;

public class FoodItemEntity {

	private String name;
	private double price;
	private FoodType foodType;
	private int quantity;
	private double discount;

	public FoodItemEntity() {
		System.out.println("Created FoodItemEntity");
	}

	public FoodItemEntity(String name, double price, FoodType foodType, int quantity, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.quantity = quantity;
		this.discount = discount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItemEntity other = (FoodItemEntity) obj;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (foodType != other.foodType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", foodType=" + foodType + ", quantity=" + quantity
				+ ", discount=" + discount + "]";
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
