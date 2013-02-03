package sortingAlgorithms;

import java.util.Arrays;

public class CopyOfHeapSort {

	
	public void heapSort(int [] a , int n)
	{
		
		for(int i=n/2 ;i>=0;i--)
		{
			int parent = i;
			int min = parent;
			int index=2*i;
			try{
			if(a[index+1]< a[parent]  && index+1<n)
				min = index+1;
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
			}
			try{
			if(a[index+2]<a[min]  &&  index+2<n)
				min = index+2;
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
			}
				swap(a, min, parent);
		}
	}
	
	public void heapify(int [] a, int n)
	{
		
		for(int i=n;i>=1;i--)
		{
			
			heapSort(a, i);
			swap(a,0,i-1);
		}
		

	}
	
	public void swap(int[] a, int min, int i)
	{
		
		int temp;
		temp = a[min];
		a[min]= a[i];
		a[i] = temp;
	}
	
	public static void printList(int [] a)
	{
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
		
		System.out.println();
	}
	public static void main(String agrs[])
	
	{
		int [] a ={3,4,8,5,2,6,10,7,1,77};
		CopyOfHeapSort sort = new CopyOfHeapSort();
		sort.heapify(a, a.length);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
	}
}