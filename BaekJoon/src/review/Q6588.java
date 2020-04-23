package review;

import java.util.*;

public class Q6588 {
	public static final int MAX = 1000000;
	public static boolean check[] = new boolean[MAX+1];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		check[1]=true;
		for(int i=2;i*i<=MAX;i++) {
			if(check[i]==true) 
				continue;
			for(int j=i+i;j<=MAX;j=j+i) {
				check[j]=true;
			}
		}
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			for(int i=2;i<=n;i++) {
				if(check[i]==true)
					continue;
				if(check[n-i]==false) {
					System.out.println(n+" = "+i+" + "+(n-i));
					break;
				}
			}
		}
	}

}
