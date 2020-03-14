package code_plus.부르트_포스;

import java.util.Scanner;

public class 다음_순열_10972 {
	public static boolean next_permutation(int[] num) {
		int i = num.length-1;
		
		
		while(i>0 && num[i-1]>=num[i]) {
			i-=1;
		}
		
		if(i<=0) {
			return false;
		}
		int j = num.length-1;
		while(num[j]<=num[i-1]) {
			j-=1;
		}
		
		j = num.length-1;
		int temp = num[i-1];
		num[i-1]=num[j];
		num[j]=temp;
		
		while(i<j) {
			temp = num[i];
			num[i]=num[j];
			num[j]=temp;
			i+=1;
			j-=1;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        if (next_permutation(a)) {
            for (int i=0; i<n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
	}

}
