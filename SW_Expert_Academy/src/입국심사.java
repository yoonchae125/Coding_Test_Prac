import java.util.Scanner;

//http://bitly.kr/6WRqhDK3I

public class 입국심사 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int T[] = new int[n];
			for(int i=0;i<n;i++) {
				T[i] = sc.nextInt();
			}
			int c=0;
			while(true) {
				c++;
				int num=0;
				for(int i=0;i<n;i++) {
					num+=c/T[i];
				}
				if(num>=m) {
					System.out.println("#"+tc+" "+c);
					break;
				}
			}
		}
		
	}

}
