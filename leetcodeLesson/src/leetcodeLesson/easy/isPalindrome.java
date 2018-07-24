/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * 
 * Example 1:
 * 		Input: 121, Output: true
 * 
 * Example 2:
 * 		Input: -121, Output: false
 * 		Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 * 		Input: 10, Output: false
 * 		Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * ***** Follow up: Coud you solve it without converting the integer to a string? *****
 */


package leetcodeLesson.easy;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "T/F :"+ palindrome(121) );
	}

	public static boolean palindrome( int x ) {
		
		String str = String.valueOf(x);
		if( x < 0 ){
			return false;
		}else{
			char[] charArr1 = str.toCharArray();
			char[] charArr2 = new char[charArr1.length];
			
			for( int i=charArr1.length-1, index=0 ; i>=0 ; i--, index++ ){
				charArr2[index] = charArr1[i];
			}
			
			if( String.valueOf(charArr1).equals(String.valueOf(charArr2)) ){
				return true;
			}else{
				return false;
			}
			
		}
    }
	
	
}
