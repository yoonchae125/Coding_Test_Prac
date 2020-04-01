package review;

import java.util.Scanner;

public class Q15651 {
	//답 나올 때마다 출력하면 시간 초과
	public static int a[];
	static StringBuilder sb=new StringBuilder();
	public static void go(int n, int m, int idx) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				sb.append(a[i]+" ");
			}sb.append("\n");
			return;
		}
		for(int i=0;i<n;i++) {
			a[idx]=i+1;
			go(n,m,idx+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a = new int[m];
		
		go(n,m,0);
		System.out.println(sb);
	}

}
