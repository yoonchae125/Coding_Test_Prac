import java.util.Scanner;

public class Q9778_카드게임 {

	public static int d[];
	public static void reset() {
		d = new int[12];
		for(int i=2;i<=9;i++) {
			d[i] = 4;
		}
		d[10] = 16;
		d[11] = 4;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			reset();
			for(int i:d) {
				System.out.print(i+",");
			}
			int n = sc.nextInt();
			int a[] = new int[n];
			int sum=0;
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				d[a[i]]--;
				sum+=a[i];
			}
			int cut = 21-sum;
			System.out.println(sum+","+cut);
			int under=0;
			int up=0;
			for(int i=2;i<12;i++) {
				if(i<=cut) {
					
					under+=d[i];
				}else {
					up+=d[i];
				}
			}
			if(up>=under)
				System.out.println("#"+t+" STOP");
			else
				System.out.println("#"+t+" GAZUA");
		}
		
	}

}
