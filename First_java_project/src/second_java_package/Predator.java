package second_java_package;

public interface Predator {
	String getFood();
	
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	int LEG_COUNT = 4; // interface 상수
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator {
	public String getFood() {
		return "apple";
	}
}

class Lion extends Animal implements Predator {
	public String getFood() {
		return "banana";
	}
}

class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
}

class Crocodile extends Animal implements Predator {
	public String getFood() {
		return "crocodilefood";
	}
}

