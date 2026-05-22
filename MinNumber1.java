package java1;
import java.util.Scanner;


public class MinNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 정수 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		System.out.println("최소값: "+min);
		
	}

}
