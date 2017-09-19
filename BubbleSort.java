public class BubbleSort implements SortingAlgorithm{
	
	public void sort(int[] a){
		for(int i = 0; i<a.length-1; i++){
			boolean swapped = false;
			for(int j = 0; j<a.length-i-1; j++){
				//compare element next to eachother, bubble up if larger elem is before
				if(a[j] > a[j+1])
					swap(a,j,j+1);
				swapped = true;
			}
			//if no swaps occurred, no need to continue the program
			if(swapped == false){
				break;
			}
		}
	}
	//swap method
	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}