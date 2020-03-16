package code_plus.부르트_포스;

import java.util.Scanner;

public class 로또_6603 {
	public static boolean next_permutation(int[] a) {
		int i =a.length-1;
		while(i>0 && a[i-1]<=a[i]) {
			i--;
		}
		if(i<=0)
			return false;
		int j = a.length-1;
		while(a[j]>=a[i-1]) {
			j--;
		}
		int temp = a[i-1];
		a[i-1]=a[j];
		a[j] = temp;
		
		j = a.length-1;
		while(i<j) {
			temp = a[i];
			a[i]=a[j];
			a[j] = temp;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n =sc.nextInt();
			if(n==0)
				break;
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int d[] = new int[n];
			for(int i=0;i<n;i++) {
				if(i<6)
					d[i]=1;
				else 
					d[i]=0;
			}
			//1 6개 0 n-6개 
			do {
				for(int i=0;i<n;i++) {
					if(d[i]==1)
						System.out.print(a[i]+" ");
				}System.out.println();
			}while(next_permutation(d));
			System.out.println();
		}
	}

}
