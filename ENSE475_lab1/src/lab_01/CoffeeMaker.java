package lab_01;


/**
 * Coffee Maker Simulation
 *
 */



/**
 * @author Alihusain
 *
 */
public class CoffeeMaker {
	
	public Inventory inventory= new Inventory();
    int rList=0;
    public static final int MAX_INVENTORY = 20;
    public static final int MAX_NUM_RECIPES = 4;
    public static Recipe[] recipe = new Recipe[MAX_NUM_RECIPES];
    public CoffeeMaker(){
    	for(int i=0;i<MAX_NUM_RECIPES;i++)
    	{	
    		recipe[i]=new Recipe("none",0,0,0);
    	}
        inventory.setCoffee(MAX_INVENTORY);
        inventory.setSugar(MAX_INVENTORY);
        inventory.setMilk(MAX_INVENTORY);
    }
    
    
    
    
    /**
     * Getter of the property
     * 
     * @return Returns the inventory
     */
    public Inventory getInventory() {
    	return inventory;
    }
    
   
    
     /**
      * addRecipe Method
     * 
     * @param rAdd
     * 
     * @return true or false
     */
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
    
   
    /**
     * getRecipe Method
     * 
     * @param recipeName
     * 
     * @return recipe[i] or null
     */
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

    
   
    /**
     * deleteRecipe Method
     * 
     * @param recipeName
     * 
     * @return true or false
     */
    public boolean deleteRecipe(String recipeName) {
    	for (int i=0; i<MAX_NUM_RECIPES; i++) {
        	if(recipe[i].recipeName.equals(recipeName))
        	{
        		recipe[i]=new Recipe("none",0,0,0);
        		rList--;
        		return true;
        	}
        }
    	return false;
    }    
    
  
    /**
     * makeCoffee Method
     * 
     * @param recipeName
     * 
     * @return true or false
     */
    public boolean makeCoffee(String recipeName) {
    	for (int i=0; i<MAX_NUM_RECIPES; i++) {
        	if(recipe[i].recipeName.equals(recipeName))
        	{
        		if(recipe[i].coffeeLevel<=inventory.coffee &&  recipe[i].sugarLevel<=inventory.sugar && recipe[i].milkLevel<=inventory.milk)
        		{
        		inventory.coffee=inventory.coffee-recipe[i].coffeeLevel;
        		inventory.sugar=inventory.sugar-recipe[i].sugarLevel;
        		inventory.milk=inventory.milk-recipe[i].milkLevel;
        		return true;
        		}
        		System.out.println("Insufficient inventory");
        		return false;
        	}
        }
    	System.out.println("Recipe not found");
    	return false;
	
	
	
	
	
    }
	
	
	

}
