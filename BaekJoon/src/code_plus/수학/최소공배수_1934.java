package code_plus.수학;

import java.util.Scanner;

public class 최소공배수_1934 {
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int lcm = a*b;
			lcm = lcm/gcd(a,b);
			System.out.println(lcm);
		}
	}

}
