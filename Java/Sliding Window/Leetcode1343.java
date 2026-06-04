/*Problem No - 1343 From leetcode
Title - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Description :
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
Example 2:

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 

Constraints:

1 <= arr.length <= 105
1 <= arr[i] <= 104
1 <= k <= arr.length
0 <= threshold <= 104
*/


class Leetcode1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold){
        int count=0; 

        int sum=0;
        for( int i=0 ; i < k ; i++ ){
            sum+=arr[i]; 
        }

        int target = threshold * k;

        if(sum >= target)
            count++;

        for(int i= k ; i < arr.length ; i++){
           
           sum = sum + arr[i] - arr[i-k];
            if(sum >= target)
                count++;    
        }
        return count;
    }
        
    public static void main(String [] args){

        int arr={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold = 4;

        int result = numOfSubarrays(arr, k, threshold);
        System.out.println(result);
    } 
}  