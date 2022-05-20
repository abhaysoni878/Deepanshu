//Given an array of integers nums which is sorted in ascending order, and an integer target, 
//write a function to search target in nums. 
//If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.

//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
import java.util.*;
public class BinarySearch {
	
	    public int search(int[] nums, int target) {
	        while(nums.length == 0) return -1;
	            int left=0;
	            int right=nums.length-1;
	        
	        while(left<=right)
	        {    
	            int mid = left + (right-left)/2; 
	            if(nums[mid] == target)
	            {
	                return mid;
	            }
	            else if(nums[mid] >= target)
	            {
	                right = mid - 1;
	            }
	            else
	            {
	                left = mid +1;
	            }
	        }
	        return -1; 
	    }
	     public static void main(String[] args)
	     {
	         int target,i,j;
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Howmany number are of the array");
	         int n = sc.nextInt();
	         System.out.println("ënter the number of the array");
	         int nums[] = new int[n];
	         for(i=0;i<n;i++)
	         {
	             nums[i]= sc.nextInt();
	         }
	         System.out.println("enter the target value");
	         //int target = sc.nextInt();
	         
	         
	     }
	}


