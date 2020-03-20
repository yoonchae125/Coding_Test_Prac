package code_plus.부르트포스_N과M;

import java.util.*;

public class N과M_5_15654 {
	public static int ans[];
	public static boolean c[];
	public static void go(int n, int m, int[]a ,int idx,int start) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				System.out.print(a[ans[i]]+ " ");
			}System.out.println();
			return;
		}
		for(int i=start;i<n;i++) {
			if(c[i])
				continue;
			c[i]=true;
			ans[idx]=i;
			go(n,m,a,idx+1,i+1);
			c[i]=false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n개의 숫자 중  
		int m = sc.nextInt(); // m개 골라  
		ans = new int[m];
		c = new boolean[n];
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		go(n,m,a,0,0);
	}

}
