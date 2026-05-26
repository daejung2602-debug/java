package ajkjajfa;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2이상 입력");
		int num = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		
		for(int i=2; i<=num; i++) { //범위 중요!! 연산자 중요!!
			if(num%i ==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+"은(는) 소수이다.");
		}else {
			System.out.println(num+"은(는) 소수가아니다.");
		}
		
	}

}
