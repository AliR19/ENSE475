package Lab4;


/**
 * @author Alihusain (SID: 200379478)
 *
 */
public class Commission {

	 public int CalculateSales(int lock, int stock,int  barrel) {
	    	return (lock*45+stock*30+barrel*25);
	    }
	    
	    public double CalculateCommission(int lock, int stock,int  barrel) {
	    	double result=0;
	    	if(lock<1 || stock<1 || barrel<1) {
	    		return 0;
	    	}
	    	else {
	    		int sales=CalculateSales(lock,stock,barrel); 
	    		if(sales<=1000) {
	    			result=sales*.1;
	    		}
	    		else if(sales>1000 && sales<=1800) {
	    			result=1000*.1;
	    			result=result+(sales-1000)*.15;
	    		}
	            else if(sales>1800) {
	            	result=1000*.1;
	    			result=result+800*.15;
	    			result=result+(sales-1800)*.2;
	    		}
	    		
	    		return result;
	    	}
	    }
	}

	
	
	
	
	
	
	
	

