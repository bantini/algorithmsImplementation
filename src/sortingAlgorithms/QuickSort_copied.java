package sortingAlgorithms;

public class QuickSort_copied {
	  public static void main(String[] args){
		  int[] a={1,2,3,4,5,6,7,8,9};
		  int p=0;
		  int r = a.length-1;
		  quicksort(a,p,r);
		  for(int i=0;i<a.length;i++)
			  System.out.println(a[i]);
			  
		  }
	  public static void quicksort(int a[], int p,int r){
		  if(p<r){
			  int q=partition(a,p,r);
			  quicksort(a,p,q-1);
			  quicksort(a,q+1,r);
			  
			  
		  }
		  
	  }
	  public static int partition(int a[], int p,int r){
		  int x=a[r];
		  int i=p-1;
		  for(int j = p;j<=r-1;j++){
			  if(a[j]<x)
			  {
				  i=i+1;
				  int temp = a[i];
				  a[i]= a[j];
				  a[j] = temp;
				  
				  
			  }
			 		  
		  }
		  int temp = a[i+1];
		  a[i+1] = a[r];
		  a[r]= temp;
		  return i+1;  
		  
	  }
		  
	  }

