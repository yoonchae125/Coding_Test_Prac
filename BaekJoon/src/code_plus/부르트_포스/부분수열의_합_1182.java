package code_plus.부르트_포스;

import java.util.Scanner;

public class 부분수열의_합_1182 {
	static int s;
	static int n;
	static int a[];
	public static int go(int idx,int sum) {
		if(idx==n ) {
			if(sum==s)
				return 1;
			else
				return 0;
		}
		return go(idx+1,sum+a[idx])+go(idx+1,sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		s = sc.nextInt();
		a= new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int ans = go(0,0);
		if (s == 0) {
            ans -= 1;
        }
		System.out.println(ans);

	}

}
