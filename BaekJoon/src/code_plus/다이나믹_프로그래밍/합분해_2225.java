package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;

public class 합분해_2225 {
	static final int mod = 1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long[][] d = new long[k+1][n+1];
        d[0][0] = 1;
        for (int i=1; i<=k; i++) {
            for (int j=0; j<=n; j++) {
                for (int l=0; l<=j; l++) {
                    d[i][j] += d[i-1][j-l];
                    d[i][j] %= mod;
                }
            }
        }
        System.out.println(d[k][n]);
	}

}
