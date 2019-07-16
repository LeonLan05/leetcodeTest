/*
 * 在三位整數中，例如 153 可以滿足 1^3 + 5^3 + 3^3 = 153，這樣的數稱為阿姆斯壯數
 * 試以程式找出所有三位數的阿姆斯壯數。
 */
package lesson1_8.practice;

public class Ch03_Practice02 {

	public static void main(String[] args) {
		
		for( int i=100 ; i<1000 ; i++ ) {
			int armsNum = ArmstrongNum(i);
			if( armsNum > 0 ) {
				System.out.println("ArmstrongNum :" + armsNum);
			}
		}
	}

	private static Integer ArmstrongNum( Integer num ) {
		char[] nums = String.valueOf(num).toCharArray();
		Integer result = 0;
		
		for( char a : nums ) {
			result += (int) Math.pow(Integer.valueOf(String.valueOf(a)), 3);
		}
		
		if( result.equals(num) ) {
			return result;
		}else {
			return -1;
		}
	}
	
}
