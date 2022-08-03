package Fisrt_java_package;
import java.util.Arrays;
import java.util.HashSet;

public class study_Set {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
		System.out.println(set);
		// Set - 집합 자료형 - 순서 X, 중복 허용 X
		// 주로 중복을 제거하기 위한 필터로서 종종 사용한다.
		
		// 집합연산을 위한 Set 자료들 생성
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));
		
		// 교집합 - retainAll
		HashSet<Integer> intersection = new HashSet<>(s1); // s1 으로 intersection 생성
		intersection.retainAll(s2);
		System.out.println(intersection); // 교집합 [3]
		
		// 합집합 - addAll
		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		System.out.println(union); // 합칩합 [1, 2, 3, 4, 5]
		
		// 차집합 = removeAll
		HashSet<Integer> substract = new HashSet<>(s1);
		substract.removeAll(s2);
		System.out.println(substract); // 차집합 [1, 2]
		
		/*
		값을 추가 할 땐 add
		set_name.add("value");
		여러개 추가 할 땐 addAll - 합집합
		set_name.addAll(Arrays.asList("1", "2"));
		특정 값 제거 remove
		set_name.remove("value");
		 */
		
		
		// 상수집합 Enum
		

	}
}
