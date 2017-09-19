public class MergeSort implements SortingAlgorithm{
	private int[] a;
    private int[] temp;

    private int alength;

    public void sort(int[] a) {
        
        
    }

    

    void merge(int [] target, int [] top, int [] bot) {
    		int topindex = 0;
    		int botindex = 0;
    		int aindex = 0;
    		while(topindex < top.length && botindex < bot.length){
    			if (top[topindex] <= bot[botindex])
    					a[aindex++] = top[topindex++];
    			else
    				a[aindex++] = bot[botindex++];
    		}
    		while(topindex<top.length)
    			a[aindex++] = top[topindex++];
    		while(botindex<bot.length)
    			a[aindex++] = bot[topindex++];
       }
    
    
}