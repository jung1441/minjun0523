import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }


        int v = scanner.nextInt();

        int B = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == v) {
                B++;
            }
        }

        System.out.println(B);
    }
}
