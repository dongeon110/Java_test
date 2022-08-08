package jump_to_java_chapter5;
import java.util.ArrayList;
import java.util.Arrays;


public class Q4 {
	public static void main (String[] args) {
		// 정수 배열
		int[] data = {1, 3, 5, 7, 9};
		Calculator cal = new Calculator();
		int result = cal.avg(data);
		System.out.println(result); 
		
		// 정수 리스트
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		Calculator cal2 = new Calculator();
		int result2 = cal2.avg(data);
		System.out.println(result2);
	}
}
