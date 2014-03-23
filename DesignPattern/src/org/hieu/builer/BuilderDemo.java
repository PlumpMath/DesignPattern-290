package org.hieu.builer;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mBuilder = new MealBuilder();
		
		Meal vegMeal = mBuilder.prepareVegMeal();
		System.out.println("Veg Meal"); 
		vegMeal.showItems(); 
		System.out.println("Total Cost: " +vegMeal.getCost());
		
		Meal nonVegMeal = mBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal"); 
		nonVegMeal.showItems(); 
		System.out.println("Total Cost: " +nonVegMeal.getCost());	
		
	}

}
