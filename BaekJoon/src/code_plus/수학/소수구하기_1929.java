package code_plus.수학;

import java.util.Scanner;

public class 소수구하기_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		 
		boolean check[] = new boolean[n+1]; //false -> prime
		check[0] = check[1] = true;
		
		for(int i=2;i<n+1;i++) {
			if (check[i] == true) {
                continue;
            }
			for(int j=i*i;j<n+1;j+=i) {
				check[j]=true;
			}
		}
		for(int i=m;i<n+1;i++) {
			if(check[i]== false)
				System.out.println(i);
		}
	}

}
