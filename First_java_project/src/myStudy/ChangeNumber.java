package myStudy;

import java.util.HashMap;

class Solution{
	public int solution(String s) {
		int answer = 0;
		String strAnswer = "";
		
		HashMap<String, String> change = new HashMap<>();
		change.put("zero", "0");
		change.put("one", "1");
		change.put("two", "2");
		change.put("three", "3");
		change.put("four", "4");
		change.put("five", "5");
		change.put("six", "6");
		change.put("seven", "7");
		change.put("eight", "8");
		change.put("nine", "9");
		
		
		
		
		
		
		
		return answer;
	}
}


public class ChangeNumber {
	public static void main (String[] args) {
		Solution sol = new Solution();
		
		String a = "one4seveneight";
		String b = "23four5six7";
		String c = "1zerotwozero3";
		String d = "2three45sixseven";
		String e = "123";
		
		String[] list = {"a", "b", "c", "d", "e"};
		for(String qq : list) {
			System.out.println(sol.solution(qq));
		}
		
	}
}
