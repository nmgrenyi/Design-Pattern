package builderPattern;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Burger burger = new VegBurger();
		Meal meal = new Meal();
		ColdDrink pepsi = new Pepsi();
		meal.addItem(burger);
		meal.addItem(pepsi);
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Burger burger = new ChickenBurger();
		Meal meal = new Meal();
		ColdDrink coke = new Coke();
		meal.addItem(burger);
		meal.addItem(coke);
		return meal;
	}
}
