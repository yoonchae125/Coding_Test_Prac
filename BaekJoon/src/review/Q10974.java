package review;

import java.util.Scanner;

public class Q10974 {
	public static boolean next_permutation(int num[]) {
		int i = num.length-1;
		while(i>0 && num[i-1]>=num[i]) {
			i--;
		}
		if(i<=0)
			return false;
		int j = num.length-1;
		while(num[j]<=num[i-1]) {
			j--;
		}
		int temp = num[i-1];
		num[i-1] = num[j];
		num[j] = temp;
		
		j = num.length-1;
		while(j>i) {
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			j--;
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=i+1;
		}
		do {
			for(int i=0;i<n;i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
		}while(next_permutation(num));
	}

}
