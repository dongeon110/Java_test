package Fisrt_java_package;
import java.util.Scanner; // 입력
import java.util.ArrayList; // List
import java.util.Arrays;

public class First_java_class {
	
	public static void main(String[] args) {
		
//		System.out.println("Scanner 값 입력");
//		Scanner sc_name = new Scanner(System.in);
//		
//		System.out.println(sc_name.nextInt());
//		
//		
//		int a = 1; // 정수
//		float b = 3.14f; // 실수
//		char c = 'A'; // 문자
//		String d = "Hello"; // 문자열
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		
//		System.out.println(~a);
		
		int a1 = 3;
		int a2 = 4;
		System.out.println(a2/a1);
		
		
		int a;
	    int b;
	    a=5;
	    b=3;
	    System.out.println(a==b); // false
	    System.out.println(a!=b); // true
		
//		System.out.print("문자열 출력"); // 문자열 출력
//		System.out.println('A'); // 문자 1개 문자값 출력, ln은 줄바꿈 까지
//		System.out.println(1000); // 실수형 값 출력
//		
//		System.out.printf("%s", "문자역 출력은 %s");
//		System.out.printf("%c", 'A'); // 문자값 출력은 %c
//		System.out.printf("%d", 100); // 정수는 %d
//		System.out.printf("%f", 100.1); // 실수는 %f
	    
	    
	   ArrayList pitches = new ArrayList();
	   pitches.add("138"); // 0번째
	   pitches.add("129"); // 1번째
	   pitches.add("142"); // 2번째
	   pitches.add(3, "123"); // 3번째
	   
	   System.out.println(pitches.get(1)); // 1번째 값 얻기 get // 129
	   System.out.println(pitches.size()); // 리스트 크기 size // 4
	   System.out.println(pitches.contains("142")); // 값을 포함하는지 contains // true
	   System.out.println(pitches.remove("129")); // 객체 삭제 // true - 성공적인 삭제
	   System.out.println(pitches.remove(0)); // 인덱스로 삭제 // 138 - 성공적인 삭제
	   
	   ArrayList<String> new_pitches = new ArrayList<>(); // 이 리스트에 들어가는 자료형은 String 뿐이다. 제네릭스
	   new_pitches.add("138"); // 0번째
	   new_pitches.add("129"); // 1번째
	   new_pitches.add("142"); // 2번째
	   new_pitches.add(3, "123"); // 3번째
	   
	   String one = (String) pitches.get(0); // 제네릭스를 안써서 형변환 필요
	   String two = new_pitches.get(1); // 형변환 필요 x
	   
	   
	   // 이미 데이터가 있다면 java.util.Arrays를 Import 하고 사용할 수 있다.
	   String[] data = {"123", "456", "789"}; // 이미 데이터가 있다면
	   ArrayList<String> pitches1 = new ArrayList<>(Arrays.asList(data));
	   System.out.println(pitches1); // [123, 456, 789] 출력
	   
	   // 이렇게도 가능
	   ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList("123", "345", "567"));
	   System.out.println(pitches2);
	   
	   // 리스트를 문자열로 바꾸고 싶을때
	   String result = String.join(",", pitches);
	   System.out.println(result); // println 안에서 remove를 해도 원래 변수에 영향이 가는 것을 확인 // 142,123
	   // String.join("구분자", 리스트객체)와 같이 사용하며, String.join메소드는 Java 8 버전부터 사용할 수 있다.
	   
	
	}
	
}
