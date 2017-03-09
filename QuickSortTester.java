//Team Banana Bread
//Kelly Wang, Dima Hvirtsman, Vernita Lawren
//APCS2 pd1
//Lab01 -- What Does the Data Say?
//2017-03-09


import java.util.ArrayList;

public class QuickSortTester {

    public static int[] crtData(int length){
	int[] data = new int[length];
	for (int x = 0; x < length; x++){
	    data[x] = (int)(Math.random()*100);
	}
	return data;
    }

    //finds mean of execution times
    public static long avgTime(ArrayList<Long> data) {
	long total = 0;
	data.remove(0); //for some reason, the first element is outlandishly big
	for (long x : data) {
	    System.out.println(x);
	    total += x;
	}
	return total / data.size();
    }

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) {

	//testing arrays with 1 integer
	ArrayList<Long> timeData1 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    QuickSort.qsort(crtData(1));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1: " + avgTime(timeData1));


	//testing arrays with 10 integers
	ArrayList<Long> timeData10 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    QuickSort.qsort(crtData(10));
	    execTime = (System.nanoTime()) - execTime;
	    timeData10.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 10: " + avgTime(timeData10));

	//testing arrays with 100 integers
	ArrayList<Long> timeData100 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    QuickSort.qsort(crtData(100));
	    execTime = (System.nanoTime()) - execTime;
	    timeData100.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 100: " + avgTime(timeData100));

	//testing arrays with 1000 integers
	ArrayList<Long> timeData1000 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    QuickSort.qsort(crtData(1000));
	    execTime = (System.nanoTime()) - execTime;
	    timeData1000.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 1000: " + avgTime(timeData1000));

	//testing arrays with 2500 integers
	ArrayList<Long> timeData2500 = new ArrayList<Long>();
	for (int x = 0; x < 25; x++) {
	    long execTime = System.nanoTime();
	    QuickSort.qsort(crtData(2500));
	    execTime = (System.nanoTime()) - execTime;
	    timeData2500.add(execTime);
	}
	System.out.println("Mean execution times for dataset of size 2500: " + avgTime(timeData2500));

    }//end Main
}//end class
