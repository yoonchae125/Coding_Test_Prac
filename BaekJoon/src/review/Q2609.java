package review;

import java.util.Scanner;

public class Q2609 {
	public static int GCD(int a, int b) {
		if(b==0)
			return a;
		return GCD(b, a%b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(); int b = sc.nextInt();
		System.out.println(GCD(a,b));
		System.out.println((a*b)/GCD(a,b));
	}

}
