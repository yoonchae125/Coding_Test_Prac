package review;

import java.util.*;

public class Q10844 {

	public static void main(String[] args) {
		long mod = 1000000000L;
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long d[][] = new long[n+1][10];
		for (int i=1; i<=9; i++) {
            d[1][i] = 1;
        }
		for(int i=2;i<=n;i++) {
			for(int j=0;j<10;j++) {
				if(j-1>=0) {
					d[i][j]+=d[i-1][j-1];
				}
				if(j+1<10) {
					d[i][j]+=d[i-1][j+1];
				}
				d[i][j]%=mod;
			}
		}
		long ans = 0;
        for (int i=0; i<=9; i++) {
            ans += d[n][i];
        }
        ans %= mod;
        System.out.println(ans);
	}

}
