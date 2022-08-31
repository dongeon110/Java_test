package myStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpenChat {
	public String[] solution(String[] record) {
		String[] answer = {};
		ArrayList<String> newRecord = new ArrayList(Arrays.asList(record));
		
		ArrayList<String> aList = new ArrayList<>();
		ArrayList<String> idList = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		for (int i=0; i<newRecord.size(); i++) {
			String[] word = newRecord.get(i).split(" ");
			ArrayList<String> newWord = new ArrayList(Arrays.asList(word));
			
			aList.add(newWord.get(0));
			idList.add(newWord.get(1));
			try {
				nameList.add(newWord.get(2));
			} catch(IndexOutOfBoundsException e) {
				nameList.add("");
			}
		}
		
		
		for(int i=0; i<newRecord.size(); i++) {
			String whoId = idList.get(i);
			String newName = nameList.get(i);
			
			if (aList.get(i).equals("Change")) {
				aList.set(i, "Changed");
				
				for (int findId=0; findId<i; findId++) {
					if(idList.get(findId).equals(whoId)) {
						nameList.set(findId, newName);
					}
				}
			}
			
			if (aList.get(i).equals("Enter")) {
				aList.set(i, "Entered");
				
				for (int findId=0; findId<i; findId++) {
					if(idList.get(findId).equals(whoId)) {
						nameList.set(findId, newName);
					}
				}
			}
			
			if (aList.get(i).equals("Leave")) {
				String setName = "";
				for (int findId=0; findId<i; findId++) {
					if (idList.get(findId).equals(whoId)) {
						setName = nameList.get(findId);
					}
				}
				nameList.set(i, setName);
			}
			
		}
		
		ArrayList<String> arrAnswer = new ArrayList<>();
		
		for(int i=0; i<newRecord.size(); i++) {
			String resultStr = "";
			if (aList.get(i).equals("Changed")) continue;
			
			if (aList.get(i).equals("Entered")) {
				resultStr += nameList.get(i);
				resultStr += "님이 들어왔습니다.";
			}
			
			if (aList.get(i).equals("Leave")) {
				resultStr += nameList.get(i);
				resultStr += "님이 나갔습니다.";
			}
			
			arrAnswer.add(resultStr);
		}
		
		answer = arrAnswer.toArray(new String[arrAnswer.size()]);
		
		return answer;
	}
	
	
	
	
	
	public static void main(String[] args) {
		OpenChat openChat = new OpenChat();
		
		String[] test = {
				"Enter uid1234 Muzi",
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid4567 Ryan"};

		System.out.println((openChat.solution(test)));
	}
}
