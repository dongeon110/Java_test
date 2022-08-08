package second_java_package;

public class study_interface {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(crocodile);
		
		int a = Predator.speed();
		System.out.println(a);
	}
}
