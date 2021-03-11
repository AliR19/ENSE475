package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lab4.Commission;

/**
 * @author Alihusain (SID: 200379478)
 *
 */
class TestCommission {

	
		Commission com = new Commission();
		double result = 0.0;
		@Test
		void NoLocksSold() {
			result = com.CalculateCommission(0, 1, 1); // sales=55
			assertEquals(result, 0);
		}
		
		@Test
		void NoStocksSold() {
			result = com.CalculateCommission(1, 0, 1); // sales=70
			assertEquals(result, 0);
		}
		
		@Test
		void NoBarrelsSold() {
			result = com.CalculateCommission(1, 1, 0); // sales=75
			assertEquals(result, 0);
		}
		
		@Test
		void lowerBoundOfFirstCase() {
			result = com.CalculateCommission(2, 1, 35); // sales=995
			assertEquals(result, 99.5);
		}
		
		@Test
		void OnBoundOfFirstCase() {
			result = com.CalculateCommission(2, 2, 34); // sales=1000
			System.out.println(result);
			assertEquals(result, 100.0);
		}
		
		@Test
		void upperBoundOfFirstCase() {
			result = com.CalculateCommission(1, 2, 36); // sales=1005
			assertEquals(result, 100.75);
		}
		
		@Test
		void lowerBoundOfSecondCase() {
			result = com.CalculateCommission(2, 56, 1); // sales=1795
			assertEquals(result, 219.25);
		}
		
		@Test
		void OnBoundOfSecondCase() {
			result = com.CalculateCommission(1, 1, 69); // sales=1800
			assertEquals(result, 220.0);
		}
		
		@Test
		void UpperBoundOfSecondCase() {
			result = com.CalculateCommission(1, 2, 68); // sales=1805
			assertEquals(result, 221.0);
		}
		
	}

