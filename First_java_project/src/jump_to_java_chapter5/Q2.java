package jump_to_java_chapter5;

class MaxLimitCalculator extends Calculator {
	int getValue() {
		if (this.value > 100) {
			this.value = 100;
		}
		return this.value;
	}
}

public class Q2 {
	public static void main (String[] args) {
		MaxLimitCalculator cal = new MaxLimitCalculator();
		cal.add(50);
		cal.add(60);
		System.out.println(cal.getValue());
	}
}
