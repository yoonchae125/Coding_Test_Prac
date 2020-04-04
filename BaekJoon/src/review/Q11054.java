package review;

import java.util.Scanner;

public class Q11054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		int inc[]=new int[n];
		int dec[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			inc[i]=1;
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]) {
					inc[i]=Math.max(inc[i], inc[j]+1);
				}
			}
		}
		
		for(int i=n-1;i>=0;i--) {
			dec[i]=1;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[i]) {
					dec[i]=Math.max(dec[i], dec[j]+1);
				}
			}
		}
		int ans = inc[0]+dec[0]-1;
		for(int i=0;i<n;i++) {
//			System.out.println(inc[i]);
//			System.out.println(dec[i]);
			ans = Math.max(ans, inc[i]+dec[i]-1);
		}
		System.out.println(ans);
	}

}
