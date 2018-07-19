/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

package leetcodeLesson.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		try{
			for( int i : twoSum(nums, target) ){
				System.out.println(i);
			}
		} catch(IllegalArgumentException e){
			System.out.println(e);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        for( int i=0 ; i<nums.length ; i++ ){
        	int d1 = target - nums[i];
            
            if( list.contains(d1) ){
                return new int[] { i, list.indexOf(d1) };
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
	

}
