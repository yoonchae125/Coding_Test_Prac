package Samsung;

import java.util.Scanner;

public class Q14888_연산자끼워넣기 {
	public static int MIN = Integer.MAX_VALUE;
	public static int MAX = Integer.MIN_VALUE;
	public static int a[];
	public static void go(int idx, int plus,int minus, int mul, int div,int now) {
		if(idx == a.length) {
			MIN = Math.min(MIN, now);
			MAX = Math.max(MAX, now);
			return;
		}

		if(plus>0)
			go(idx+1, plus-1,minus,mul,div,now+a[idx]);
		if(minus>0)
			go(idx+1, plus,minus-1,mul,div,now-a[idx]);
		if(mul>0)
			go(idx+1, plus,minus,mul-1,div,now*a[idx]);
		if(div>0)
			go(idx+1, plus,minus,mul,div-1,now/a[idx]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int plus = sc.nextInt();
		int minus = sc.nextInt();
		int mul = sc.nextInt();
		int div = sc.nextInt();
		
		go(1,plus,minus,mul,div,a[0]);
		System.out.println(MAX+"\n"+MIN);
	}

}
