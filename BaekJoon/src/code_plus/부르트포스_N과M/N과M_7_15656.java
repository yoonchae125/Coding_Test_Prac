package code_plus.부르트포스_N과M;

import java.util.*;

public class N과M_7_15656 {
	public static int ans[];
	static StringBuilder sb = new StringBuilder();
	public static void go(int n, int m, int[]a ,int idx,int start,int selected) {
		if(selected==m) {
//			for(int i=0;i<m;i++) {
//				System.out.print(a[ans[i]]+ " ");
//			}System.out.println();
//			StringBuilder sb = new StringBuilder();
            for (int i=0; i<m; i++) {
                sb.append(a[ans[i]]);
                if (i != m-1) sb.append(" ");
            }
            sb.append("\n");
			return;
		}
		for(int i=start;i<n;i++) {
			
			ans[idx]=i;
			go(n,m,a,idx+1,i,selected+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n개의 숫자 중  
		int m = sc.nextInt(); // m개 골라  
		ans = new int[m];
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		go(n,m,a,0,0,0);
		System.out.println(sb);
	}

}
