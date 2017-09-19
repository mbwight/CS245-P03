public class QuickSort implements SortingAlgorithm{
	public void sort(int[] a){
		qsort(a,0,a.length-1);
	}
	//start sorting full array
	
	public void qsort(int[] a, int top, int bot){
		int pivot = partition(a,top,bot);
		if(top < pivot)
			qsort(a,top,pivot-1);
		if(bot > pivot)
			qsort(a,pivot+1,bot);
		
			
		//all values less than pivot go to bottom array
		//all values greater than pivot go to top array
		
	}
	//choose partition(middle)
	int partition(int[] a, int top, int bot){
		int i = top;
		int j = bot;
		int pivot = (top+bot)/2;
		//find stopping point for i>pivot, j<pivot
		//swap positions when both find the ending point
		while(i<=j){
			while(a[i] < a[pivot])
				i++;
			while(a[j] > a[pivot])
				j--;
			if(i<=j){
				swap(a,i,j);
				i++;
				j--;
			}
		
		}
		return pivot;
	}
	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}