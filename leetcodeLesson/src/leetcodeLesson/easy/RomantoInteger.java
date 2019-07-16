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
		System.out.println( "Roman to Integer :"+ romanToInt("") );
	}
	
	public static int romanToInt(String s) {
		
		Map<String, Integer> romanMap = new HashMap<String, Integer>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		
		int sl = s.length();
		int result = 0;
		
		for (int i=0 ; i<sl ; i++) {
			switch(s.charAt(i)) {
			case 'I':
			}
		} 
		
		
        return 0;
    }
}
