package Lab2;

public class CoffeeMaker {
    Inventory inventory= new Inventory();
    int rList=0;
    public static final int MAX_INVENTORY = 20;
    public static final int MAX_NUM_RECIPES = 4;
    public static Recipe[] recipe = new Recipe[MAX_NUM_RECIPES];
    public CoffeeMaker(){
    	for(int i=0;i<MAX_NUM_RECIPES;i++)
    	{	
    		recipe[i]=new Recipe("none",0,0,0,0,0,0,0,0,0);
    	}
        inventory.setCoffee(MAX_INVENTORY);
        inventory.setSugar(MAX_INVENTORY);
        inventory.setMilk(MAX_INVENTORY);
        inventory.setSyrup(MAX_INVENTORY);
    	inventory.setCocoapowder(MAX_INVENTORY);
    	inventory.setWater(MAX_INVENTORY);
    	inventory.setCinnamonstick(MAX_INVENTORY);
    	inventory.setVanillaextract(MAX_INVENTORY);
    	inventory.setEspresso(MAX_INVENTORY);
    }
    
    public Inventory getInventory() {
    	return inventory;
    }
    
    public boolean addRecipe(Recipe rAdd) {
    
		if (rList <MAX_NUM_RECIPES)
        {
            for (int i=0; i<MAX_NUM_RECIPES; i++) 
            {
            	if(recipe[i].recipeName.equals("none"))
            	{
            		recipe[i]=rAdd;
            		rList++;
            		break;
            	}
            }
            return true;
        }
        else
        	System.out.println("Recipe Storage is full");
            return false;
    }
    
    public Recipe getRecipe(String recipeName)
    {
    	for (int i=0; i<MAX_NUM_RECIPES; i++)
    	{
        	if(recipe[i].recipeName.equals(recipeName))
        	{
        		return recipe[i];
        	}
        }
    	return null;
    }    

    
    public boolean deleteRecipe(String recipeName) {
    	for (int i=0; i<MAX_NUM_RECIPES; i++) {
        	if(recipe[i].recipeName.equals(recipeName))
        	{
        		recipe[i]=new Recipe("none",0,0,0,0,0,0,0,0,0);
        		rList--;
        		return true;
        	}
        }
    	return false;
    }    
    
    public boolean makeCoffee(String recipeName) {
    	for (int i=0; i<MAX_NUM_RECIPES; i++) {
        	if(recipe[i].recipeName.equals(recipeName))
        	{
        		if(recipe[i].coffeeLevel<=inventory.coffee &&  recipe[i].sugarLevel<=inventory.sugar && recipe[i].milkLevel<=inventory.milk)
        		{
        		inventory.coffee=inventory.coffee-recipe[i].coffeeLevel;
        		inventory.sugar=inventory.sugar-recipe[i].sugarLevel;
        		inventory.milk=inventory.milk-recipe[i].milkLevel;
        		inventory.syrup=inventory.syrup-recipe[i].syrup;
            	inventory.cocoapowder=inventory.cocoapowder-recipe[i].cocoapowder;
            	inventory.water=inventory.water-recipe[i].water;
            	inventory.cinnamonstick=inventory.cinnamonstick-recipe[i].cinnamonstick;
            	inventory.vanillaextract=inventory.vanillaextract-recipe[i].vanillaextract;
            	inventory.espresso=inventory.espresso-recipe[i].espresso;
        		return true;
        		}
        		System.out.println("Insufficient inventory");
        		return false;
        	}
        }
    	System.out.println("Recipe not found");
    	return false;
    } 
    
    public boolean addInventory(int milkLevel,int sugarLevel,int coffeeLevel,int syrup, int cocoapowder, int water, int cinnamonstick, int vanillaextract, int espresso) {
    	inventory.setCoffee(inventory.coffee+coffeeLevel);
    	inventory.setSugar(inventory.sugar+sugarLevel);
    	inventory.setMilk(inventory.milk+milkLevel);
    	inventory.setSyrup(inventory.syrup+syrup);
    	inventory.setCocoapowder(inventory.cocoapowder+cocoapowder);
    	inventory.setWater(inventory.water+water);
    	inventory.setCinnamonstick(inventory.cinnamonstick+cinnamonstick);
    	inventory.setVanillaextract(inventory.vanillaextract+vanillaextract);
    	inventory.setEspresso(inventory.espresso+espresso);
    	return true;
    }

    public boolean editRecipe(Recipe rEdit) {
        
		if (rList <MAX_NUM_RECIPES)
        {
            for (int i=0; i<MAX_NUM_RECIPES; i++) 
            {
            	if(recipe[i].recipeName.equals("recipeName"))
            	{
            		recipe[i]=rEdit;
            		return true;
}
            }
        }
		System.out.println("Recipe not found");
		return false;
    }
}