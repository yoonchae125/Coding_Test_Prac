package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;

public class 이친수_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d[] = new long[n+1];
		
		d[1]=1;
		if (n >= 2) {
            d[2] = 1;
        }
		for(int i=3;i<=n;i++) {
			d[i] = d[i-2]+d[i-1];
		}
		System.out.println(d[n]);
	}

}
