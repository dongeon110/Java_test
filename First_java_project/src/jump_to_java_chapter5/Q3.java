package jump_to_java_chapter5;

public class Q3 {
	public static void main (String[] args) {
		Calculator cal = new Calculator();
		cal.add(50);
		System.out.println(cal.isOdd());
		cal.add(1);
		System.out.println(cal.isOdd());
		
		if (cal.isOdd()) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}
}
