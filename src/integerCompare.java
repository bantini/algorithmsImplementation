import static java.lang.System.out;


public class integerCompare {

	 private static boolean compareInt (int x, String op , int y)
	    {
	        switch (op) {
	        case "==": 
	        	if(x==y)
	        		return true;
	        	else
	        		return false;
	        case "!=":
	        	if(x!=y)
	        		return true;
	        	else
	        		return false;
	        case "<":  
	        	if(x<y)
	        		return true;
	        	else
	        		return false;
	        case "<=": 
	        	if(x<=y)
	        		return true;
	        	else
	        		return false;
	        case ">":
	        	if(x>y)
	        		return true;
	        	else
	        		return false;
	        case ">=":
	        	if(x>=y)
	        		return true;
	        	else
	        		return false;
	        default: { out.println ("compare: error - unexpected op"); return false; }
	        } // switch
	    } // compare
	   
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareInt(1,"==",3));
	}

}
