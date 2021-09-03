package basics;

public class ConditionalBlocks {
	
	public static void main(String[] args) {
		boolean b = false;
		boolean firstCondition = false;
		boolean secondCondition = true;
		
		if (b) {
			System.out.println("Inside the First if-statement");
		}else {
		      System.out.println("inside the First else-statement");
	    }
		
	
		
	    if (firstCondition){
	        System.out.println("inside the if-statement");

	        if (secondCondition){
	          System.out.println("inside the nested if-statement");
	        }
	      }else if (secondCondition){
	        System.out.println(5);
	      }else {
	        System.out.println("inside the else-statement");
	      }

	    System.out.println("Outside the if-statement");
	}
}
