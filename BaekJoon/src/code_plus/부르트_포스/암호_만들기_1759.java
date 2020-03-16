package code_plus.부르트_포스;

import java.util.*;

public class 암호_만들기_1759 {
	public static void go(int n, String[] alpha, String password, int i) {
		if(n==password.length()) {
			if(check(password))
				System.out.println(password);
			return;
		}
		if(i>=alpha.length)
			return;
		go(n,alpha,password+alpha[i],i+1);
		go(n,alpha,password,i+1);
	}
	public static boolean check(String password) {
		int mo = 0;
		int ja = 0;
		for(int i=0;i<password.length();i++) {
			char c = password.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				mo++;
			}else {
				ja++;
			}
			
		}
		if(mo>=1&&ja>=2)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String[] alpha = new String[m];
        for (int i=0; i<m; i++) {
            alpha[i] = sc.next();
        }
        
        Arrays.sort(alpha);
        
        go(n, alpha, "", 0);
	}

}
