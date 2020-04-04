package review;

import java.util.*;

public class Q11722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int d[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			d[i]=1;
			for(int j=0;j<i;j++) {
				if(a[j]>a[i]) {
					d[i]=Math.max(d[j]+1, d[i]);
				}
			}
		}
		Arrays.sort(d);
		
		System.out.println(d[n-1]);
	}

}
