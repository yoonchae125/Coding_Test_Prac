package code_plus.부르트_포스;

import java.util.Arrays;
import java.util.Scanner;

public class 차이를_최대로_10819 {
	public static boolean next_permutation(int[] a) {
		int i = a.length-1;
		while(i>0 && a[i-1]>=a[i]) {
			i--;
		}
		if(i<=0)
			return false;
		
		int j = a.length - 1;
		while(a[j]<=a[i-1]) {
			j--;
		}
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		
		while(j>i) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans = 0;
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		do {
			int sum=0;
			for(int i=0;i<n-1;i++) {
				sum+=Math.abs(a[i]-a[i+1]);
			}
			ans = Math.max(sum,ans);
		}while(next_permutation(a)) ;
		
		System.out.println(ans);
	}

}
