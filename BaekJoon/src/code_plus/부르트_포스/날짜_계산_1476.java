package code_plus.부르트_포스;

import java.util.Scanner;

public class 날짜_계산_1476 {
	public static final int E = 15;
	public static final int S = 28;
	public static final int M = 19;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e, s, m; //15, 28, 19
		e= sc.nextInt()-1;
		s= sc.nextInt()-1;
		m= sc.nextInt()-1;
		sc.close();
		int ee=1, ss=1, mm=1;
		
		
		for(int i=1;;i++) {
			if(ee==e&&ss==s&&mm==m) {
				System.out.println(i+1);
				break;
			}
			
			ee=(ee+1)%E;
			ss=(ss+1)%S;
			mm=(mm+1)%M;
		}
	}
	

}
