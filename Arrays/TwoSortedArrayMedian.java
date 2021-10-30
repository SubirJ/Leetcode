/*
Finding the median of two sorted arrays
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000

Psuedo code :
PartitionX +PartitionY = (x+y+1) / 2

Found :
	maxLeftX <= minRightY
	maxLeftY <= minRightX
	
else if :
	maxLeftX > minRightY
		move towards left in X
	
else:
	move towards right in X
*/

import java.util.*;

class TwoSortedArrayMedian{

	//The following function takes intput as two arrays and returns the median of the two
	//Time Complexity : log(m+n) where m and n are the length of two arrays
	public static double findMedian(int[] arr1, int[] arr2){
		//We will be processing binary Search logic on the smallest array which will be arr1 in our case
		//If arr1 > arr2 then we swicth
		if(arr1.length > arr2.length)
			return findMedian(arr2, arr1);
			
		int x = arr1.length;
		int y = arr2.length;
		
		int low = 0;
		int high = x;
		while(low <= high){
			int partitionX = (low+high) / 2;
			int partitionY = (x+y+1) / 2 - partitionX;
			
			//If partitionX is 0 it means nothing is there on the left so consider -INF for maxLeftX
			//If partitionX is length of the input then there is nothing on right side. Use +INF for minRightX
			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : arr1[partitionX - 1];
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : arr1[partitionX];
			
			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : arr2[partitionY - 1];
			int minRightY = (partitionY == y) ? Integer.MAX_VALUE : arr2[partitionY];
			
			if(maxLeftX <= minRightY && maxLeftY <= minRightX){
				//We have partitioned the array  at correct place
				//Now get max of left elements and min of right elements to get the median in case of even length combined array size
				if((x+y) % 2 == 0){
					return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
				}
				else
					return ((double)Math.max(maxLeftX, maxLeftY));
			}
			else if(maxLeftX > minRightY){// We are too far on right side for partition. Go on left side
				high = partitionX - 1;
			}
			else{//We are too far on the left side. Move to right side
				low = partitionX + 1;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		int[] arr1 = {23,26,31,35};
		int[] arr2 = {3,5,7,9,11,16};
		
		System.out.println(findMedian(arr1, arr2));
	}
}