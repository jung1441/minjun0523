import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0; // 최댓값을 저장 하는 변수
		int b = 0; // 최대값의 위치를 저장할 변수 
		
		for (int i=1; i<=9; i++) {
			int c = scanner.nextInt();
			
			if(c > a) {
				 a = c;
				 b = i;
			}
		}
		System.out.println(a);
		System.out.println(b);
		

	}

}
