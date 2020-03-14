package code_plus.수학;

import java.util.Scanner;

public class 골드바흐의_추측_6588 {
	public static final int MAX = 1000000;
	public static void main(String[] args) {
		boolean[] check = new boolean[MAX+1];
		check[0] = check[1] = true;

		
		for(int i=2;i*i<=MAX;i++) {
			if(check[i]==true)
				continue;
			for(int j=i+i;j<=MAX;j+=i) {
				check[j]=true;
			}
			
		}
		
		Scanner sc= new Scanner(System.in);
		int n=-1;
		while(n!=0) {
			n = sc.nextInt();
			for(int i=2;i<=n;i++) {
				if(check[i]==true)
					continue;
				if(check[n-i]==false) {
					System.out.println(n+" = "+i+" + "+(n-i));
					break;
				}
			}
		}

	}

}
