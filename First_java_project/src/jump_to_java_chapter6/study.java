package jump_to_java_chapter6;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class study {
	public static void main(String[] args) throws IOException {
//		InputStream in = System.in;
		
//		byte[] a = new byte[3];
//		in.read(a);
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		
		
//		InputStreamReader reader = new InputStreamReader(in);
////		char[] a = new char[3];
////		reader.read(a);
////		
////		System.out.println(a);
//		
//		
//		BufferedReader br = new BufferedReader(reader);
//		
//		String b = br.readLine();
//		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		// next() method는 단어 하나(Token)을 읽어들인다
		// next 단어, nextLine 라인, nextInt 정수
		
	}
}

// IOException 예외처리