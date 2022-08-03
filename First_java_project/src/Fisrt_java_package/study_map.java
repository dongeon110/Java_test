package Fisrt_java_package;
import java.util.HashMap;
import java.util.ArrayList;

public class study_map {
	public static void main(String[] args) {
		
		// Map . import java.util.HashMap 을 우선적으로 해야한다
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구"); // key - value 로 구성된 딕셔너리 같은 형태, 리스트와 마찬가지로 제네릭스 사용
		
		// 값을 얻기 위해서는 get
		System.out.println(map.get("people")); // 사람
		System.out.println(map.get("wow")); // key가 없으면 null 반환
		// null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메소드 사용
		System.out.println(map.getOrDefault("java", "자바")); // 자바 출력
		
		// key가 있는지 없는지 확인 하기 위해서는 containsKey
		System.out.println(map.containsKey("people")); // true 출력
		// remove - Map의 항목을 삭제하는 메소드
		System.out.println(map.remove("people")); // 사람 출력
		System.out.println(map.get("people")); // remove가 되었기 때문에 null 출력
		// size - Map의 개수를 리턴
		map.put("people", "사람");
		System.out.println(map.size()); // 2
		
		// keySet은 Map의 모든 Key를 모아서 리턴
		System.out.println(map.keySet()); // [baseball, people] <- Set 자료형
		// Set 자료형은 List 자료형으로 바꾸어서 사용할 수 있다.
		ArrayList<String> keyList = new ArrayList<>(map.keySet());
		System.out.println(keyList);
		
		
	}
}
