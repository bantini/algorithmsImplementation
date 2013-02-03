package sortingAlgorithms;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		quickSort(a,0,a.length-1);
		for(int i =0;i<10;i++)
			System.out.println(a[i]);
	}
	static void quickSort(int[] a, int left, int right){
		//System.out.println(s);
		if(left<right){
			int  part = partition(a,left,right);
			quickSort(a,left,part-1);
			quickSort(a,part+1,right);
			
		}
		
	}
	
	static int partition(int[] a,int left, int right){
		int pivot = (left+right)/2;
		System.out.println("pivot: "+pivot);
		//int temp=a[pivot];
		//a[pivot] = a[right];
		//a[right] = temp;
		int store = left;
		//System.out.println("store: "+store);
		for(int i=left;i<=(right-1);i++){
			if(a[i]<a[right]){
				int temp=a[i];
				a[i]=a[store];
				a[store]=temp;
				store++;
			}
			int temp=a[store];
			a[store]=a[right];
			a[right]=temp;
			
		}
			return store;
	}
	

}
