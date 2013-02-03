package recursion;

public class Robo123Steps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(run(10));
		// TODO Auto-generated method stub
		

	}
	static int run(int i){
		if(i<0)
			return 0;
		else if(i==0)
			return 1;
		else
			return run(i-1)+run(i-2)+run(i-3);
		
		
		
			
		
		
	}

}
