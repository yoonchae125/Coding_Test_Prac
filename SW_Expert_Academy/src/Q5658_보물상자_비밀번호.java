import java.util.*;

public class Q5658_보물상자_비밀번호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String str = sc.next();
			HashSet<Integer> set = new HashSet<Integer>();
			Queue<Integer> q = new LinkedList<Integer>();
			Queue<Integer> nq = new LinkedList<Integer>();
			for(int i=0;i<n;i++) {
				int num = str.charAt(i)-'0';
				if(num>9)
					num = num-7;
				q.add(num);
			}
			int len = n/4;
			for(int i=0;i<len;i++) {
				nq = new LinkedList<Integer>();
				for(int j=0;j<4;j++) {
					int number=0;
					for(int z=len-1;z>=0;z--) {
						int num = q.poll();
						nq.add(num);
						number+=num*Math.pow(16, z);
					}
//					System.out.println(number);
					set.add(number);
				}
				q=nq;
				q.add(q.poll());
			}
			ArrayList numbers = new ArrayList(set);
			Collections.sort(numbers);
			Collections.reverse(numbers);
			System.out.println(numbers.get(k-1));
		}
//		char c ='A';
//		System.out.println(c-'0'-7);
	}

}
