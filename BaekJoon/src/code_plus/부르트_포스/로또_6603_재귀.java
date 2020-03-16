package code_plus.부르트_포스;

import java.util.*;

public class 로또_6603_재귀 {
	static ArrayList<Integer> lotto = new ArrayList<Integer>();
	public static void go(int a[],int idx) {
		if(lotto.size()==6) {
			for(int i=0;i<6;i++) {
				System.out.print(lotto.get(i)+" ");
			}System.out.println();
			return;
		}
		if(idx>=a.length)
			return;
		lotto.add(a[idx]);
		go(a,idx+1);
		lotto.remove(lotto.size()-1);
		go(a,idx+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0)
				break;
			int a[] = new int[n];
			for(int i =0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			go(a,0);
			System.out.println();
		}
	}

}
