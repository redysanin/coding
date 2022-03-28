package coding.test.examples;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
	
	public static boolean isPresent(String value,Map<Character,Integer> count) {
		Map<Character,Integer> innercount= new HashMap<Character,Integer>();
		for(int i=0;i<value.length();i++) {
			Character c = Character.valueOf(value.charAt(i));
			if(count.containsKey(c)) {
				if(innercount.containsKey(c)) {
					innercount.put(c, innercount.get(c)+1);
				}else {
					innercount.put(c,1);
				}
				if(innercount.get(c) > count.get(c)) {
					return false;
				}
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static int countCharacters(String[] words, String chars) {
	        
		if(chars.length()==0) {
			return 0;
		}
		Map<Character,Integer> count= new HashMap<Character,Integer>();
		
		for(int i=0;i<chars.length();i++) {
			Character c = Character.valueOf(chars.charAt(i));
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}else {
				count.put(c,1);
			}
		}
		int result=0;
		for(String value : words) {
			if(isPresent(value,count)) {
				result=result+value.length();
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chars="atach";
		String[] words= {"cabt","bt","hat","tree" };
		
		System.out.println(countCharacters(words,chars));
	}

}


//You are given an array of strings words and a string chars.
//
//A string is good if it can be formed by characters from chars (each character can only be used once).
//
//Return the sum of lengths of all good strings in words.
//
//Example 1:
//
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//Example 2:
//
//Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//Output: 10
//Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
