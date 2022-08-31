package myStudy;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class LengthSol {

	public int solution(String s) {
		int answer = s.length();
		int half = s.length()/2;
		
		// j는 길이
		for (int j=1; j<half+1; j++) {
			int jnum = 0;

			ArrayList<String> list = new ArrayList<>();
			
			// 문자열 잘라서 중복검사를 위해 Set과 List로 add
			for(int i=j; i<=s.length(); i+=j) {
				String a = s.substring(i-j, i);

				list.add(a);
			}
			if(s.length()%j != 0) {
				int mok = s.length() / j;
				String a = s.substring(mok*j, s.length());
				list.add(a);
			}
			

			
			
			for(int i=0; i<list.size(); i++) {
				int count = 1;
				try {
					while (list.get(i).equals(list.get(i+1))) {
						count++;
						list.remove(i);
					}
				} catch (IndexOutOfBoundsException e) {}
				if (count == 1) {
					
				} else if (count<10) {
					jnum += 1;
				} else if (count < 100) {
					jnum += 2;
				} else if (count < 1000) {
					jnum += 3;
				}
				

			}
			

			String newWord = "";
			for(int i=0; i<list.size(); i++) {
				newWord += list.get(i);
			}
			
			jnum += newWord.length();
			
			if(jnum < answer) {
				answer = jnum;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String[] a = {"aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd", "abcabcabcabc"};
		LengthSol sol = new LengthSol();
		for(String y : a) {
			System.out.println("--" + y + "--");
			int x = sol.solution(y);
			System.out.println(x);
		}
		
		ArrayList<String> test = new ArrayList<>();
		test.add("asdf");
		test.add("asdf");
		
	}
}
