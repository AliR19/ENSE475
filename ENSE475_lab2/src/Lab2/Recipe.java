package Lab2;

public class Recipe {

	public String recipeName;
	public int coffeeLevel;
	public int sugarLevel;
	public int milkLevel; 
	public int syrup;
	public int cocoapowder;
	public int water;
	public int cinnamonstick;
	public int vanillaextract;
	public int espresso;

	public Recipe(String recipeName,int milkLevel,int sugarLevel,int coffeeLevel, int syrup, int cocoapowder, int water, int cinnamonstick, int vanillaextract, int espresso) {
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
	    
	    if(syrup >= 0 && syrup<= CoffeeMaker.MAX_INVENTORY) {
	    	this.syrup = syrup;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Syrup Level Exceeded");
		}
	    
	    if(cocoapowder >= 0 && cocoapowder<= CoffeeMaker.MAX_INVENTORY) {
	    	this.cocoapowder = cocoapowder;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Cocoa Powder Level Exceeded");
		}
	    
	    if(water >= 0 && water<= CoffeeMaker.MAX_INVENTORY) {
	    	this.water = water;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Water Level Exceeded");
		}
	    
	    if(cinnamonstick >= 0 && cinnamonstick<= CoffeeMaker.MAX_INVENTORY) {
	    	this.cinnamonstick = cinnamonstick;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Cinnamon stick amount Exceeded");
		}
	    
	    if(vanillaextract >= 0 && vanillaextract<= CoffeeMaker.MAX_INVENTORY) {
	    	this.vanillaextract = vanillaextract;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Vanilla Extract Level Exceeded");
		}
	    
	    if(espresso >= 0 && espresso<= CoffeeMaker.MAX_INVENTORY) {
	    	this.espresso = espresso;
	    }
		else {
			this.recipeName = "none";
			System.out.println("Maximum Espresso Level Exceeded");
		}
	    
	}

	public int getSyrup() {
		return syrup;
	}

	public int getCocoapowder() {
		return cocoapowder;
	}

	public int getWater() {
		return water;
	}

	public int getCinnamonstick() {
		return cinnamonstick;
	}

	public int getVanillaextract() {
		return vanillaextract;
	}

	public int getEspresso() {
		return espresso;
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