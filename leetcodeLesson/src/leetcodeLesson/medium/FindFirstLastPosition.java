package leetcodeLesson.medium;

public class FindFirstLastPosition {

	public static void main(String[] args) {
		int[] range = {5, 7, 7, 8, 8, 10};
		System.out.println( printArray(searchRange1(range, 6)) );
	}

	public static int[] searchRange1(int[] nums, int target) {
		int[] targeRange = {-1, -1};
		
		// find left element Position
		for( int i=0 ; i<nums.length ; i++ ){
			if( nums[i] == target ) {
				targeRange[0] = i;
				break;
			}
		}
		if( targeRange[0] == -1 ){
			return targeRange;
		}
		
		// find right element Position
		for( int j=nums.length-1 ; j>=0 ; j-- ){
			if( nums[j] == target ) {
				targeRange[1] = j;
				break;
			}
		}
		
		return targeRange;
	}

	private static String printArray( int[] array ){
		StringBuilder sb = new StringBuilder();
		sb.append("[ ").append(array[0]).append(", ").append(array[1]).append(" ]");
		return sb.toString();
	}
}
