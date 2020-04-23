package review;

import java.util.Scanner;

public class Q1182_2 {
	public static int n ,s, ans=0;
	public static int a[];
	public static void go(int idx,int sum) {
		if(idx==n) {
			if(sum==s) {
				ans++;
			}
			return;
		}
		go(idx+1,sum+a[idx]);
		go(idx+1,sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		go(0,0);
		if (s == 0) {
            ans -= 1;
        }
		System.out.println(ans);
	}

}
