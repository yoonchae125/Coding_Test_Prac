package code_plus.부르트_포스;

import java.util.*;

public class 연산자_끼워넣기_14888_재귀 {
	static ArrayList<Integer> ans = new ArrayList<Integer>();
	public static void go(int a[], int idx,int cur, int plus, int minus, int mul, int div) {
		
		if(plus<0||minus<0||mul<0||div<0)
			return;
		if(idx==a.length) {
//			System.out.println(cur);
			ans.add(cur); return;
		}
		go(a,idx+1,cur+a[idx],plus-1,minus,mul,div);
		go(a,idx+1,cur-a[idx],plus,minus-1,mul,div);
		go(a,idx+1,cur*a[idx],plus,minus,mul-1,div);
		go(a,idx+1,cur/a[idx],plus,minus,mul,div-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int plus=0; int minus=0; int mul=0; int div=0;
		plus = sc.nextInt();
		minus = sc.nextInt();
		mul = sc.nextInt();
		div = sc.nextInt();
		
		go(a,1,a[0],plus,minus,mul,div);
		Collections.sort(ans);
		System.out.println(ans.get(ans.size()-1));
		System.out.println(ans.get(0));
	}

}
