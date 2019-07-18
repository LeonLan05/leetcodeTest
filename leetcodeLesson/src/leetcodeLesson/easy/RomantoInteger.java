/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * 		I			1
 * 		V			5
 * 		X			10
 * 		L			50
 * 		C			100
 * 		D			500
 * 		M			1000
 */

package leetcodeLesson.easy;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
		
		String[] example = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
		
		for( String exStr : example ) {
			System.out.println( exStr + "\t to Integer :\t"+ romanToInt(exStr) );
		}
	}
	
	public static int romanToInt(String s) {
		
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int result = 0; // 結果
		
		char[] chars = s.toCharArray();
		int pre = 1000;
		for ( char c : chars ) {
			int cur = romanMap.get(c);
			result += cur;
			if( cur > pre ) {
				result = result - (2*pre);
			}
			pre = cur;
		}
		
        return result;
    }
}































