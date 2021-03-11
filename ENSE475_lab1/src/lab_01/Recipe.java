package lab_01;

public class Recipe {

	public String recipeName;
	public int coffeeLevel;
	public int sugarLevel;
	public int milkLevel; 
	 
	public Recipe(String recipeName,int milkLevel,int sugarLevel,int coffeeLevel) {
		this.recipeName = recipeName;
		if(coffeeLevel >= 0 && coffeeLevel<= CoffeeMaker.MAX_INVENTORY) {
			this.coffeeLevel = coffeeLevel;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Coffee Level Exceeded");
		}
		if(sugarLevel >= 0 && sugarLevel<= CoffeeMaker.MAX_INVENTORY) {
			this.sugarLevel = sugarLevel;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Sugar Level Exceeded");
		}
	    if(milkLevel >= 0 && milkLevel<= CoffeeMaker.MAX_INVENTORY) {
	    	this.milkLevel = milkLevel;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Milk Level Exceeded");
		}
	    
	}

	public String getRecipeName() {
	    return recipeName;
	}

	public int getMilkLevel() {
	    return milkLevel;
	}
	public int getSugarLevel() {
	    return sugarLevel;
	}
	public int getCoffeeLevel() {
	    return coffeeLevel;
	}
	
	
	
	
	
	
	
	
	
	
}
