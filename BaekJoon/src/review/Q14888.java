package review;

import java.util.*;

public class Q14888 {
	public static ArrayList<Integer> results = new ArrayList<Integer>();
	public static int a[];
	public static int n;
	public static void go(int idx, int now, int plus, int minus, int mul,int div) {
		if(plus<0 || minus<0 || mul<0 || div<0) {
			return;
		}
		if(n==idx) {
			results.add(now);
			return;
		}
		go(idx+1,now+a[idx],plus-1,minus,mul,div);
		go(idx+1,now-a[idx],plus,minus-1,mul,div);
		go(idx+1,now*a[idx],plus,minus,mul-1,div);
		go(idx+1,now/a[idx],plus,minus,mul,div-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int plus = sc.nextInt();
		int minus = sc.nextInt();
		int mul = sc.nextInt();
		int div = sc.nextInt();
		
		go(1,a[0],plus,minus,mul,div);
		
		Collections.sort(results);
		System.out.println(results.get(results.size()-1));
		System.out.println(results.get(0));
	}

}
