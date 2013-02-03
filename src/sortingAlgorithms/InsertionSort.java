package sortingAlgorithms;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a ={10,9,8,7,6,5,4,3,2,1};
		for(int i=0;i<10;i++)
			System.out.println(a[i]);
		for(int i=0;i<10;i++){
			insert(a,i,a[i]);
			
		}
		for(int i=0;i<10;i++)
			System.out.println(a[i]);
	}
	
	public static void insert(int[] a,int position,int value){
		int i = position-1;
		while(i>=0 && a[i]>value){
			a[i+1]=a[i];
			i=i-1;
			
		}
			a[i+1]=value;	
	}

}
