package code_plus.수학;

import java.util.Scanner;

public class 최대공약수와_최소공배수_2609 {

	// 재귀 함수 
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		// 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
		// 24 18
		
		Scanner sc = new Scanner(System.in);
		int g=1;
		int l;
		int a,b;
	
		a=sc.nextInt();
		b=sc.nextInt();
		l=a*b;
//		while(b!=0) {
//			int r = a%b;
//			a=b;
//			b=r;
//		}
		g = gcd(a,b);
//		g=a;
		l=l/g;
		System.out.println(g);
		System.out.println(l);

	}

}
