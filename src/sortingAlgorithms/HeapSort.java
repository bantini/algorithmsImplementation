package sortingAlgorithms;

public class HeapSort {
	
	//private int a[];
	//private int heapsize;
	
	public static int parent(int i){
		return i/2;
	}
	
	public static int left(int i){
		System.out.println("Left:  "+(2*i));
		return (2*i);
	}
	
	public static int right(int i){
		return ((2*i)+1);
	}
	
	public static void max_heapify(int a[], int i){
		int l=left(i);
		int r=right(i);
		int largest;
		int temp;
		
		if (l<=a.length-1 && a[l]>a[i])
			largest=l;
		else
			largest=i;
		
		if(r<=a.length-1 && a[r]>a[largest])
			largest=r;
		
		if(largest!=i){
			temp=a[i];
			a[i] = a[largest];
			a[largest]= temp;
			
		}
		
		max_heapify(a, largest);
			
		
	}
	
	public static void build_max_heap(int a[]){
		for(int i=a.length-1;i>=1;i--)
			max_heapify(a,i);
		
	}
	
	public static void heapsort(int a[]){
		build_max_heap(a);
		for(int i=a.length;i>=2;i--){
			int temp=a[i];
			a[i]=a[1];
			a[1]=temp;
			//heapsize=heapsize-1;
			max_heapify(a,1);
			
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {10,9,8,7,6,5,4,3,2,1};
		heapsort(a);
		for(int i=0;i<10;i++)
			System.out.println(i);
			
		
		

	}

}
