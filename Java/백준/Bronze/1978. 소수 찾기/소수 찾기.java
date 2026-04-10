import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); 
        int b = 0; // 최종 소수의 개수

        for (int i=0; i<a; i++) {
            int c = scanner.nextInt();
            int d = 0; // 각 숫자마다 약수의 개수를 저장할 변수이다

            // 1부터 입력받은 숫자까지 모두 나누어 봅니다.
            for (int j=1; j<=c; j++) {
                if (c % j == 0) {
                    d++; // 나누어 떨어지면 약수이므로 +1
                }
            }

            
            if (d == 2) {
                b++;
            }
        }

        System.out.print(b);
    }
}