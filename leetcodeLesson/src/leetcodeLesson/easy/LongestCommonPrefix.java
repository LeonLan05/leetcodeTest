/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * Input: ["dog","racecar","car"]
 * Output: ""
 * 
 * Explanation: There is no common prefix among the input strings.
 */

package leetcodeLesson.easy;

import java.util.HashMap;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] test = {"flower","flow","flight"};
		
		System.out.println( "String['flower','flow','flight']" );
		System.out.println( "getCommonPre :" + getCommonPre(test) );

	}
	
	public static String getCommonPre( String[] strs ){
		Trie trie = new Trie();
        for(String str : strs){
            trie.insert(str, trie);
        }
        StringBuilder ans = new StringBuilder();
        while(trie.isTrie == false && trie.map.keySet().size() == 1){
            char ch = trie.map.keySet().iterator().next();
            ans.append(ch);
            trie = trie.map.get(ch);
        }
        return ans.toString();
    }
}

	
class Trie{
    HashMap<Character,Trie> map = new HashMap<Character, Trie>();
    boolean isTrie;
    public Trie(){
        isTrie = false;
    }
    public void insert(String word, Trie trie){
        if(word.length() == 0){
            trie.isTrie = true;
            return;
        }
        for(int i = 0 ; i < word.length() ; i ++){
            if(trie.map.get(word.charAt(i)) == null){
                trie.map.put(word.charAt(i), new Trie());
            }
            trie = trie.map.get(word.charAt(i));
        }
        trie.isTrie = true;
    }
}

