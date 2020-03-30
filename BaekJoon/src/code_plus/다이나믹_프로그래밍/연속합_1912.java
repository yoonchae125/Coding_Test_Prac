package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;

public class 연속합_1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int d[] = new int[n];
		d[0]=a[0];
		for(int i=1;i<n;i++) {
			d[i]=Math.max(a[i], d[i-1]+a[i]);
			
		}
		int ans = d[0];
        for (int i=0; i<n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        System.out.println(ans);
	}

}
