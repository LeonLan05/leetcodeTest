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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 3};
		int target = 6;
		
		try{
			for( int i : twoSum3(nums, target) ){
				System.out.println(i);
			}
		} catch(IllegalArgumentException e){
			System.out.println(e);
		}
	}
	
	public static int[] twoSum( int[] nums, int target ) {
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        for( int i=0 ; i<nums.length ; i++ ){
        	int d1 = target - nums[i];
        	if( d1 == nums[i] ) continue;
            if( list.contains(d1) ){
                return new int[] { i, list.indexOf(d1) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	public static int[] twoSum2( int[] nums, int target ){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for( int i=0 ; i<nums.length ; i++ ){
			map.put(nums[i], i);
		}
		for( int i=0 ; i<nums.length ; i++ ){
			int d2 = target - nums[i];
			if( map.containsKey(d2) && map.get(d2) != i  ){
				return new int[] { i, map.get(d2) };
			}
			
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] twoSum3( int[] nums, int target ){
		
		for( int i=0 ; i<nums.length ; i++ ){
			int d3 = target - nums[i];
			
			for( int j=i+1 ; j<nums.length ; j++ ){
				if( d3 == nums[j] ){
					return new int[] {i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	

}
