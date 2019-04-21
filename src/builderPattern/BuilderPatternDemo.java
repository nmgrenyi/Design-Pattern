package builderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		
		
	}

}
