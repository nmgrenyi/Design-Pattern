package builderPattern;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Burger burger = new VegBurger();
		Meal meal = new Meal();
		meal.addItem(burger);
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Burger burger = new ChickenBurger();
		Meal meal = new Meal();
		meal.addItem(burger);
		return meal;
	}
}
