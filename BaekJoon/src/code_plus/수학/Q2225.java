package code_plus.수학;

import java.util.Scanner;

public class Q2225 {

	public static void main(String[] args) {
		long mod = 1000000000;
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
