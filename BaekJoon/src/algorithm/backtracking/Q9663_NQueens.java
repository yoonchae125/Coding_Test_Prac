package algorithm.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class Q9663_NQueens {
	static int n;
	static int a[][];
	static int col[];
	static int ans=0;
	public static void go(int row) {
		if(row==n) {
			ans++; return;
		}
		for(int i=0;i<n;i++) {
			if(isPossible(row,i)) {
				col[row]=i;
				go(row+1);
				col[row]=-1;
			}
		}
		
	}
	public static boolean isPossible(int row,int c) {
		for(int i=0;i<row;i++) {
			if(col[i]==c )
				return false;
			if(Math.abs(i-row)==Math.abs(col[i]-c)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n][n];
		col = new int[n];
		Arrays.fill(col, -1);
//		for(int i=0;i<n;i++) {
//			col[0]=i;
//			go(1);
//			col[0]=-1;
//		}
		go(0);
		System.out.println(ans);
	}

}
