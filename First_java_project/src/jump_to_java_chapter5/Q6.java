package jump_to_java_chapter5;

class Calculator2 {
	Integer value = 0;
	void add(int val) {
		this.value += val;
	}
	
	public Integer getValue() {
		return this.value;
	}
}


public class Q6 {
	public static void main (String[] args) {
		Calculator2 cal = new Calculator2();
		cal.add(3);
		System.out.println(cal.getValue());
	}

}
