package code_plus.수학;

import java.util.Scanner;

public class 소수찾기_1978 {

	public static boolean isPrime(int a) {
		if(a<2) {
			return false;
		}
		for(int i=2; i*i <= a;i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(isPrime(a))
				answer++;
		}

		System.out.println(answer);
	}

}
