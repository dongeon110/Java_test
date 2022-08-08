package jump_to_java_chapter5;

interface Predator9 {
	String bark();
}

abstract class Animal9 {
	public String hello() {
		return "hello";
	}
}

class Dog9 extends Animal9 {
}

class Lion9 extends Animal9 implements Predator9 {
	public String bark() {
		return "Bark bark!!";
	}
}

public class Q9 {
	public static void main (String[] args) {
		Animal9 a = new Lion9();
		Lion9 b = new Lion9();
		Predator9 c = new Lion9();
		
		System.out.println(a.hello());
//		System.out.println(a.bark()); // a는 동물 bark는 lion, predator
		System.out.println(b.hello());
		System.out.println(b.bark());
//		System.out.println(c.hello()); // c는 predator, hello는 animal
		System.out.println(c.bark());
	}
}
