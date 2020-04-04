package review;

import java.util.Scanner;

public class Q1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		long d[] = new long[n];
		d[0]=a[0];
		for(int i=1;i<n;i++) {
			d[i]=a[i];
			d[i]=Math.max(d[i], d[i-1]+a[i]);
		}
		
		long ans = d[0];
		for(int i=1;i<n;i++) {
			if(d[i]>ans)
				ans = d[i];
		}
		System.out.println(ans);
	}

}
