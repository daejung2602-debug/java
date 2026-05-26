package ajkjajfa;
import java.util.Scanner;
public class Operateor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		while(true) {
			System.out.print("월 입력: ");
			month = sc.nextInt();
			
			if(month>=1 && month<=12) {
				sc.close();
				break;
			}else {
				System.out.print("다시 입력.")
			}
		}
		
	}

}

