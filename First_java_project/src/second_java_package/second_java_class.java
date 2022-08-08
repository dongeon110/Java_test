package second_java_package;
import java.util.Arrays;
import java.util.ArrayList;


public class second_java_class {
	public static void main(String[] args) {
		// Chap4. Q1
		String a = "write once, run anywhere";
		if (a.contains("wife")) {
			System.out.println("wife");
		} else if (a.contains("once") && !a.contains("run")) {
			System.out.println("once");
		} else if (!a.contains("everywhere")) {
			System.out.println("everywhere");
		} else if (a.contains("anywhere")) {
			System.out.println("anywhere");
		} else {
			System.out.println("none");
		}
		// everywhere
		
		// Q2
		int q2 = 0;
		int q2sum = 0;
		while (q2 <= 1000) {
			q2sum = q2sum + q2;
			q2 = q2 + 3;
		}
		System.out.println(q2sum);
		
		// Q3
		for (int i=1; i<6; i++) {
			for (int j=1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Q4
		for (int i=1; i<=100; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println("");
		
		// Q5
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int q5sum = 0;
		for (int q5:marks) {
			q5sum += q5;
		}
		float q5average = q5sum / marks.length;
		System.out.println(q5average);
	}
}
