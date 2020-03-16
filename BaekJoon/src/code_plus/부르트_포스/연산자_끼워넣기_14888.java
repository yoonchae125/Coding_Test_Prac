package code_plus.부르트_포스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 연산자_끼워넣기_14888 {
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
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[4];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			b[i]=sc.nextInt();
		}
		
		int d[] = new int[n-1];
		for(int i=0;i<n-1;i++) {
			if(i<b[0]) {
				d[i]=1;
			}else if(i<b[0]+b[1]) {
				d[i]=2;
			}else if(i<b[0]+b[1]+b[2]) {
				d[i]=3;
			}else if(i<b[0]+b[1]+b[2]+b[3]) {
				d[i]=4;
			}
		}
        ArrayList<Integer> ans = new ArrayList<>();

		do {
			int result = a[0];
			for(int i=1;i<n;i++) {
				switch(d[i-1]) {
					case 1:
						result = result+a[i];
						break;
					case 2:
						result = result-a[i];
						break;
					case 3:
						result = result*a[i];
						break;
					case 4:
						result = result/a[i];
						break;
				}
			} 
			ans.add(result);
		}while(next_permutation(d));
		
		Collections.sort(ans);
		System.out.println(ans.get(ans.size()-1));
		System.out.println(ans.get(0));
	}

}
