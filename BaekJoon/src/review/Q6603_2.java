package review;

import java.util.*;

public class Q6603_2 {
	public static ArrayList<Integer> lotto = new ArrayList<Integer>();
//	public static void go(int idx, int a[]) {
//		if(lotto.size()==6) {
//			for(int i=0;i<6;i++) {
//				System.out.print(lotto.get(i)+" ");
//			}System.out.println();
//			return;
//		}
//		if(idx>=a.length)
//			return;
//		lotto.add(a[idx]);
//		go(idx+1,a);
//		lotto.remove(lotto.size()-1);
//		go(idx+1,a);
//	}
	public static void go(int idx,int a[]) {
		if(lotto.size()==6) {
			for(int i:lotto) {
				System.out.print(i+" ");
			}System.out.println();
			return;
		}
		if(idx >= a.length) {
			
			return;
		}
		
		lotto.add(a[idx]);
		go(idx+1,a);
		lotto.remove(lotto.size()-1);
		go(idx+1,a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int n = sc.nextInt();
			if(n==0) break;
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			go(0,a);
			System.out.println();
		}
	}

}
