/*
  Kelly Wang
  APCS2 pd1
  HW #15: So So Quick
  2017-03-09
 */

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *     Select the midpoint of the array and partition at that point. 
 *     Partition on the left side of the pivot point ( by changing your upper bound to pivotPoint) and the right side (by changing your lower bound to pivotPoint).
 *     Repeat until the lower and upper bounds reach each other. This means the whole array has been sorted.
 * 2a. Worst pivot choice / array state and associated runtime: 
 *     At the beginning or end of the array. O(n^2)
 * 2b. Best pivot choice / array state and associated runtime:
 *     At the middle of the array. This is similar to binary search, where you can keep dividing the array by 2. O(nlogn)
 * 3. Approach to handling duplicate values in array:
 *     Dupilcate numbers didn't affect my method because I was only changing the pivotPoint and left and right bounds. 
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    { 
	qsortH ( d, 0, d.length-1);
    }
    
    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.
    
    public static void qsortH( int[] arr , int lo, int hi)
    {
	if ( lo < hi) //your bounds have not reached each other. you have not sorted the whole array
	    {
		int p = partition ( arr, lo, hi, (lo+hi)/2 ); //partition the array using the midpt as pivotPos
		qsortH( arr, lo, p); //sort everything left of pivotPos
		qsortH( arr, p+1, hi); //sort everything right of pivotPos
		
	    }
    }
    
    public static int partition(int[] arr, int lo, int up, int pivot) {
        int v = arr[pivot]; 
        swap( pivot, up, arr); 
        int pivotPos = lo;
        for (int i = lo; i < up; i++) { 
            if (arr[i] < v) {
                swap( pivotPos,i , arr);
                pivotPos+=1;
            }
        }
        swap( up, pivotPos, arr);
        return pivotPos;
    }

    //main method for testing
    public static void main( String[] args ) 
    {

	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	
    }//end main

}//end class QuickSort
