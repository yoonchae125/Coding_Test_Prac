package review;

import java.util.Scanner;

public class Q1476 {
	public static int E;
	public static int M;
	public static int S;
	public static int go(int year,int e,int m, int s) {
		if(e==E && m==M && s==S) {
			return year;
		}
		e++; m++; s++;
		if(e>15) e=1;
		if(m>28) m=1;
		if(s>19) s=1;
		return go(year+1,e,m,s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		E = sc.nextInt();
		M = sc.nextInt();
		S = sc.nextInt();
		
		System.out.println(go(1,1,1,1));
	}

}
