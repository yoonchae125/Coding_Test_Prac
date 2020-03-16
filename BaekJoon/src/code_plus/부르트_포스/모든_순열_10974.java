package code_plus.부르트_포스;

import java.util.Scanner;

public class 모든_순열_10974 {
	public static boolean next_permutation(int[] a) {
		int i = a.length-1;
		while(i>0&&a[i-1]>=a[i]) {
			i-=1;
		}
		if(i<=0)
			return false;

		int j = a.length-1;
		while(a[j]<=a[i-1]) {
			j-=1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		
		while(j>i) {

			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			j--;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
            a[i] = i+1;
        }
        do {
            for (int i=0; i<n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } while(next_permutation(a));
	}

}
