package dos;

public class SortThread implements Runnable{
	
	int arr[];
	int l;
	int r;
	int retorno[];

	public SortThread(int a[], int ele, int erre) {
		this.arr = a;
		this.l = ele;
		this.r = erre;
	}
	public int[] getRetorno() {
		return this.retorno;
	}
	@Override
	public void run() {
		sort(this.arr, this.l, this.r);
	}
	
	private void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    private void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            SortThread ele = new SortThread(arr, l, m);
            //sort(arr, l, m);
            SortThread erre = new SortThread(arr, m+1, r);
            //sort(arr, m + 1, r);
            ele.run();
            erre.run();
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

}
