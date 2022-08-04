package Fisrt_java_package;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class exercise3 {
	enum CoffeeType {
		Americano,
		Ice_Americano,
		CafeLatte
	};
	
	static void coffee_price(CoffeeType type) {
		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.Americano, 3000);
		priceMap.put(CoffeeType.Ice_Americano, 4000);
		priceMap.put(CoffeeType.CafeLatte, 5000);
		
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원 입니다.", price));
	}
	
	public static void main(String[] args) {
		System.out.println("Jump to Java 3장 연습문제 (https://wikidocs.net/157658)");
		
		// Q1
		System.out.print("Q1. ");
		int korean = 80;
		int english = 75;
		int math = 55;
		
		double[] arr = { korean, english, math };
		double sum = 0.0;
		
		for (double num : arr) {
			sum += num;
		}
		
		double average = sum / arr.length;
		System.out.println("홍길동의 평균 점수 : " + average);
		
		// Q2
		System.out.print("Q2. ");
		int q2num = 13;
		if (q2num%2 == 1) {
			System.out.println(q2num + "은 홀수입니다.");
		} else {
			System.out.println(q2num + "은 짝수입니다.");
		}
		
		// Q3
		System.out.print("Q3. ");
		String q3 = "881120-1068234";
		System.out.println(q3.substring(0,6) + "는 앞자리, " + q3.substring(7) + "는 뒷자리");
		
		// Q4
		System.out.print("Q4. ");
		String pin = "881120-1068234";
		System.out.println("성별을 나타내는 숫자 : " + pin.substring(7, 8));
		
		// Q5
		System.out.print("Q5. ");
		String q5a = "a:b:c:d";
		System.out.println(q5a.replace(":", "#"));
		
		// Q6
		System.out.print("Q6. ");
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
		myList.sort(Comparator.reverseOrder());
		System.out.println(myList);
		
		// Q7
		System.out.print("Q7. ");
		ArrayList<String> q7myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
		String new_word = String.join(" ",  q7myList);
		System.out.println(new_word);
		
		// Q8
		System.out.print("Q8. ");
		HashMap<String, Integer> grade = new HashMap<>();
		grade.put("A", 90);
		grade.put("B", 80);
		grade.put("C", 70);
		System.out.println(grade.remove("B"));
		
		// Q9
		System.out.print("Q9. ");
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
		HashSet<Integer> numbers_set = new HashSet<>(numbers);
		System.out.println(numbers_set);
		
		// Q10
		System.out.print("Q10. ");
		HashMap<Integer, Integer> priceMap = new HashMap<>();
		
		coffee_price(CoffeeType.Americano);
		
	}
}
