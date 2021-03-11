package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Lab2.CoffeeMaker;
import Lab2.Recipe;

public class lab02test {



		@Test
		public void addRecipeTest2() {
			CoffeeMaker cmt=new CoffeeMaker();
			Recipe rec= new Recipe("Latte",  4, 5, 6,7,8,9,10,11,12);
			boolean addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe returns true
			rec= new Recipe("Mocha", 3, 7, 8,9,2,14,1,0,3);
			addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe returns true
			rec= new Recipe("Coffee", 3, 7, 8,0,0,4,7,8,1);
			addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe returns true
			rec= new Recipe("Tea", 3, 7, 8,6,3,6,8,0,0);
			addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe returns true
			rec= new Recipe("Expresso", 3, 7, 8,0,0,0,1,5,9);
			addresult=cmt.addRecipe(rec);
			assertEquals(false, addresult);//returns false also display "Recipe Storage is full"
		}
		
		@Test
		public void getRecipeTest2() {
			CoffeeMaker cmt=new CoffeeMaker();
			Recipe rec= new Recipe("Latte",  4, 5, 6,7,8,9,10,11,12);
			boolean addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);
			Recipe getresult= cmt.getRecipe("Latte");
			assertEquals(rec, getresult);
		}
		
		@Test
		public void editRecipeTest2() {
			CoffeeMaker cmt=new CoffeeMaker();
			Recipe rec= new Recipe("Latte",  4, 5, 6,7,8,9,10,11,12);
			boolean addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe
			rec= new Recipe("Latte", 3, 7, 8,0,0,4,7,8,1);
			assertEquals(true, addresult);
			boolean editresult=cmt.addRecipe(rec);
			assertEquals(true, editresult);
		    editresult=cmt.editRecipe(rec);
			assertEquals(true,editresult);
			assertEquals(rec, editresult);
		
		}
		
		
		
		
		
		
		
		@Test
		public void deleteRecipeTest2() {
			CoffeeMaker cmt=new CoffeeMaker();
			Recipe rec= new Recipe("Latte",  4, 5, 6,7,8,9,10,11,12);
			boolean addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe 
			boolean deleteresult= cmt.deleteRecipe("Latte");
			assertEquals(true, deleteresult);//deleting added recipe
			deleteresult= cmt.deleteRecipe("Latte");
			assertEquals(false, deleteresult);//deleting again the same recipe returns null
		}
		
		@Test
		public void getdeleteRecipeTest2() {
			CoffeeMaker cmt=new CoffeeMaker();
			Recipe rec= new Recipe("Latte", 4, 5, 6,7,8,9,10,11,12);
			boolean addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe
			boolean deleteresult= cmt.deleteRecipe("Latte");
			assertEquals(true, deleteresult);//deleting recipe
			Recipe getresult= cmt.getRecipe("Latte");
			assertEquals(null, getresult);//getting a deleted recipe returns null
		}
		
		@Test
		public void makeCoffeeTest2() {
			CoffeeMaker cmt=new CoffeeMaker();
			Recipe rec= new Recipe("Latte",  4, 5, 6,7,8,9,10,11,12);
			boolean addresult=cmt.addRecipe(rec);
			assertEquals(true, addresult);//adding recipe
			boolean makeresult= cmt.makeCoffee("Latte");
			assertEquals(true, makeresult);//making coffee
			makeresult= cmt.makeCoffee("Mocha");
			assertEquals(false, makeresult);//returns false also displays recipe not found
			
		}

	
			
		}
		

	
