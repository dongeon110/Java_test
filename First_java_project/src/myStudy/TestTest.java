package myStudy;

import java.util.HashMap;

public class TestTest {
	public static void main(String[] args) {
		int answer = 0;
		String strAnswer = "";
		String a = "23four5six7";
		
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
		
		
		for(int i=0; i<a.length(); i++) {
			String x3 = null;
			String x4 = null;
			String x5 = null;
			try {
				strAnswer += Integer.parseInt(a.substring(i,i+1));
				System.out.println(i + " : " + strAnswer);
			} catch (NumberFormatException e) {
				
				try {
					x3 = change.get(a.substring(i,i+3));
					if(x3 != null) {
						strAnswer += x3;
						System.out.println(i + " :3: " + strAnswer);
						continue;
					}
					x4 = change.get(a.substring(i,i+4));
					if (x4 != null) {
						strAnswer += x4;
						System.out.println(i + " :4: " + strAnswer);
						continue;
					}
					x5 = change.get(a.substring(i,i+5));
					if (x5 != null) {
						strAnswer += x5;
						System.out.println(i + " :5: " + strAnswer);
					} else {
						continue;
					}
				} catch (StringIndexOutOfBoundsException e2) {
					System.out.println(i + " :e: " + strAnswer);
				}
			} 
		}
		
		System.out.println(strAnswer);
		System.out.println("------------");
		System.out.println(Integer.parseInt(change.get(a.substring(7, 10))));
		
	}
}
