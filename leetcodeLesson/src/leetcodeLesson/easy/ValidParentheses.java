/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 * 	1.Open brackets must be closed by the same type of brackets.
 * 	2.Open brackets must be closed in the correct order.
 * 
 * Note that an empty string is also considered valid.
 */

package leetcodeLesson.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String[] example = {"", "()[]{}", "(]", "([)]", "{[]}", "{[[]{}]}()()"};
		
		for( String exStr : example ) {
			System.out.println( exStr + "\t isValid :" + isValid(exStr) );
		}
		
	}
	
	public static Boolean isValid( String s ) {
		
		HashMap<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
		
		Stack<Character> stack = new Stack<Character>();
		
		for ( int i=0 ; i<s.length() ; i++ ) {
			char c = s.charAt(i);
			if( mappings.containsKey(c) ) {
				char topChar = stack.empty() ? '#' : stack.pop();
				
				if( topChar != mappings.get(c) ) {
					return false;
				}
			}else {
				stack.push(c);
			}
		}
		
		return stack.isEmpty();
	}
}
