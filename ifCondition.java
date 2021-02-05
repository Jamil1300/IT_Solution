package practise;

public class ifCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   String product="iphone";
		  
	    System.out.println("welcome to mobile market");
	    
	      if(product.equals("iphone")) {
	    	  
	    	  System.out.println("price for iphone is: $1000");
	    	  
	      }else if(product.equals("samsung")) {
	    	  
	    	  System.out.println("price for samsung is: $950"); 
	    	  
	      }else {
	    	  
	    	  System.out.println("sorry we dont have this product.");
	      }
	}

}
