package test.coffee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab_01.CoffeeMaker;
import lab_01.Recipe;

/**
 * @author Alihusain
 *
 */
class lab1Test {

	@Test
	void addRecipeTest1() {
	CoffeeMaker cmt=new CoffeeMaker();
	Recipe rec = new Recipe("Test1", 4, 5, 6);
	Recipe rec1 = new Recipe("Test2", 3, 7, 8);
	Recipe rec2 = new Recipe("Test3", 20, 0, 0);
	Recipe rec3 = new Recipe("Test4", 0, 0, 20);
	Recipe overFlowRecipe= new Recipe("Test4", 0, 0, 20);
	Recipe nullRecipe= new Recipe("Test5", 0, 0, 0);

	boolean addresult=cmt.addRecipe(rec);
	assertTrue(addresult);//adding recipe returns true


	addresult=cmt.addRecipe(rec1);
	assertTrue(addresult);//adding recipe returns true


	addresult=cmt.addRecipe(rec2);
	assertTrue(addresult);//adding recipe returns true


	addresult=cmt.addRecipe(rec3);
	assertTrue(addresult);//adding recipe returns true

	addresult=cmt.addRecipe(overFlowRecipe);
	assertFalse(addresult);//returns false also display "Recipe Storage is full"

	addresult=cmt.addRecipe(nullRecipe);
	assertFalse(addresult);//returns false as 0 is not a valid level of ingredient also display "Recipe Storage is full"
	}

	@Test
	void getRecipeTest1() {
	CoffeeMaker cmt=new CoffeeMaker();
	Recipe rec= new Recipe("Test2", 4, 3, 2);
	boolean addresult=cmt.addRecipe(rec);
	assertEquals(true, addresult);
	Recipe getresult= cmt.getRecipe("Test2");
	assertEquals(rec, getresult);
	}

	@Test
	void deleteRecipeTest1() {
	CoffeeMaker cmt=new CoffeeMaker();
	Recipe rec= new Recipe("Test3", 2, 3, 6);

	boolean addresult=cmt.addRecipe(rec);
	assertTrue(addresult);//adding recipe

	boolean deleteresult= cmt.deleteRecipe("Test3");
	assertTrue(deleteresult);//deleting added recipe

	deleteresult= cmt.deleteRecipe("Test3");
	assertFalse(deleteresult);//deleting again the same recipe returns null
	}



	@Test
	void getdeleteRecipeTest1() {
	CoffeeMaker cmt=new CoffeeMaker();
	Recipe rec= new Recipe("Test1", 4, 5, 6);

	boolean addresult=cmt.addRecipe(rec);
	assertEquals(true, addresult);//adding recipe

	boolean deleteresult= cmt.deleteRecipe("Test1");
	assertEquals(true, deleteresult);//deleting recipe

	Recipe getresult= cmt.getRecipe("Test1");
	assertEquals(null, getresult);//getting a deleted recipe returns null
	}



	@Test
	void makeCoffeeTest1() {
	CoffeeMaker cmt=new CoffeeMaker();
	Recipe rec= new Recipe("Test1", 4, 5, 6);

	boolean addresult=cmt.addRecipe(rec);
	assertEquals(true, addresult);//adding recipe

	boolean makeresult= cmt.makeCoffee("Test1");
	assertEquals(true, makeresult);//making coffee

	makeresult= cmt.makeCoffee("Test2");
	assertEquals(false, makeresult);//returns false also displays recipe not found
	
	
	//checking if inventory level decreased after making coffee
	assertEquals(16, cmt.inventory.getMilk());//20-4=16
	assertEquals(15, cmt.inventory.getSugar());//20-5=15
	assertEquals(14, cmt.inventory.getCoffee());//20-6=14

	}

}
