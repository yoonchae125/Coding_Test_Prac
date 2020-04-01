package review;

import java.util.*;

public class Q15657 {
	public static int num[];
	public static int a[];
	public static StringBuilder sb = new StringBuilder();
	public static void go(int n, int m, int idx,int start) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				sb.append(a[i]+" ");
			}sb.append("\n");
			return;
		}
		for(int i=start;i<n;i++) {
			a[idx]=num[i];
			go(n,m,idx+1,i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a = new int[m];
		num = new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		go(n,m,0,0);
		System.out.println(sb);
	}

}
