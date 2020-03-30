package review;

import java.util.Arrays;
import java.util.Scanner;

public class Q1759 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
	
		String[] alpha = new String[l];
        for (int i=0; i<l; i++) {
            alpha[i] = sc.next();
        }
        
        Arrays.sort(alpha);
	}

}
