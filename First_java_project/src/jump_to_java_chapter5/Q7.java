package jump_to_java_chapter5;

interface Mineral {
	int setValue();
}

class Gold implements Mineral {
	public int setValue() {
		return 100;
	}
}

class Silver implements Mineral {
	public int setValue() {
		return 90;
	}
}

class Bronze implements Mineral {
	public int setValue() {
		return 80;
	}
}

class MineralCalculator {
	int value = 0;
	
	public void add(Mineral mineral) {
		this.value += mineral.setValue();
	}
	
	int getValue() {
		return this.value;
	}
}

public class Q7 {
	public static void main (String[] args) {
		MineralCalculator cal = new MineralCalculator();
		cal.add(new Gold());
		cal.add(new Silver());
		cal.add(new Bronze());
		System.out.println(cal.getValue());
	}

}
