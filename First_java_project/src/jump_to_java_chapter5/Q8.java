package jump_to_java_chapter5;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class Q8 {
	public static void main(String[] args) {
		Animal a = new Animal(); // 1
		Animal b = new Dog(); // 2
		Animal c = new Lion(); // 3
//		Dog d = new Animal(); // 4
		Predator e = new Lion(); // 5
	}
}

// Animal is a dog (X)
