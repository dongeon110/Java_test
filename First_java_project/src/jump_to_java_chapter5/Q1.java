package jump_to_java_chapter5;

import java.util.ArrayList;

class Calculator {
	int value;
	
	Calculator() {
		this.value = 0;
	} // Like __init__
	
	void add(int val) {
		this.value += val;
	}
	
	void minus(int val) {
		this.value -= val;
	}
	
	int getValue() {
		return this.value;
	}
	
	// Q3
	boolean isOdd() {
		if (this.value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	// Q4
	int avg(int[] array) {
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			sum += array[i];
		}
		int average = sum / array.length;
		return average;
	}
	
	int avg(ArrayList<Integer> arrlist) {
		int sum = 0;
		for (int i = 0; i<arrlist.size(); i++) {
			sum += arrlist.get(i);
		}
		int average = sum / arrlist.size();
		return average;
	}
}

public class Q1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue()); // 10 출력
		
		// 
		cal.minus(3);
		System.out.println(cal.getValue());
	}
}
