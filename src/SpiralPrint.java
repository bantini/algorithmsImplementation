
public class SpiralPrint {
	static void spiral(int a[][],int x,int y){
		if(x==y)
			return;
		int i;
		//Top-left to top-right
		for(i=x;i<y;i++)
			System.out.println(a[x][i]);
		//Top-right to bottom-right 
		for(i=x+1;i<y;i++)
			System.out.println(a[i][y-1]);
		//Bottom-right to bottom-left
		for(i=y-2;i>=x;i--)
			System.out.println(a[y-1][i]);
		//Bottom left to top-left
		for(i=y-2;i>x;i--)
			System.out.println(a[i][x]);
		
		//Recursively call spiral
		
		spiral(a,x+1,y-1);
		
	}
	
	public static void main(String[] args) {
		
		int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiral(a,0,4);
		
	}

}
