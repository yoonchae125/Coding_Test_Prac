package review;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1182 {
	static int ans=0;
	public static void go(int s,int a[],int idx,int sum) {
		if(idx==a.length) {
			
			if(s==sum) {
				ans++;
			}
			return;
		}
		go(s,a,idx+1,sum+a[idx]);
		go(s,a,idx+1,sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s = sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		go(s,a,0,0);
		if (s == 0) {
            ans -= 1;
        }
		System.out.println(ans);
	}

}
