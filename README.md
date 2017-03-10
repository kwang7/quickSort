## BananaBread: Kelly Wang, Dima Hvirtsman, Vernita Lawren
# Big(O) of QuickSort

#### Summary of QuickSort algorithm:
Select the midpoint of the array and partition at that point. 
Partition on the left side of the pivot point ( by changing your upper bound to pivotPoint) and the right side (by changing your lower bound to pivotPoint).
Repeat until the lower and upper bounds reach each other. This means the whole array has been sorted.

#### Best Case: O(nlogn) 
Every time the array is partitioned, the pivot point is the median of the array. In this case, you would have to split the array the least number of times because the array is always being divided into two. 

#### Average/Most likely Case: O(nlogn)
The pivot point is not likely to be the smallest, largest, or median value in the array.  

#### Worst Case: O(n^2)
In the worst case scenario, the pivot point selected would be the largest or smallest number of the array. In this situation, the array would not be split in two each time you partition it, so you would have to partition the array n times. 

#### Times

| Data size     | Time          | 
| ------------- |:-------------:| 
| 1             | 2537 ns       |
| 10            | 37404 ns      |
| 100           | 84928 ns      |
| 1000          | 271662 ns     |
| 2500          | 480776 ns     |