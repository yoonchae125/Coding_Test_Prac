import java.util.*;

public class Q1767_프로세서_연결하기 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0) {
//			int ans = 0;
//			int n = sc.nextInt();
//			int a[][] = new int[n][n];
//			Queue<Integer> q = new LinkedList<Integer>();
//			for(int i=0;i<n;i++) {
//				for(int j=0;j<n;j++) {
//					a[i][j] = sc.nextInt();
//					if(a[i][j] == 1) {
//						q.add(i); q.add(j);
//					}
//		
//				}
//			}
//			while(!q.isEmpty()) {
//				int x = q.poll(); int y = q.poll();
//				HashMap<Integer,Integer> len = new HashMap<Integer,Integer>();
//				len.put(1, x); // 위 
//				len.put(2, n-x-1); // 아래 
//				len.put(3, y); // 왼 
//				len.put(4, n-y-1); // 오른 
//				
//				List<Integer> keySetList = new ArrayList<>(len.keySet());
//				Collections.sort(keySetList, (o1, o2) -> (len.get(o1).compareTo(len.get(o2)))); // hashmap value기준 오름차순 정렬 
//				boolean find = false;
//				for(int key:keySetList) {
//					int i=0;
//					switch(key) {
//					case 1:
//						for(i=0;i<x;i++) {
//							if(a[i][y]==1) {
//								break;
//							}
//						}if(i==x) {System.out.println("find "+len.get(key));ans+=len.get(key); find=true;}
//						break;
//					
//					case 2:
//						for(i=n-1;i>x;i--) {
//							if(a[i][y]==1) {
//								break;
//							}
//						}if(i==x) {System.out.println("find "+len.get(key));ans+=len.get(key);find=true;}
//						break;
//					
//					case 3:
//						for(i=0;i<y;i++) {
//							if(a[x][i]==1) {
//								break;
//							}
//						}if(i==y) {System.out.println("find "+len.get(key));ans+=len.get(key);find=true;}
//						break;
//					
//					case 4:
//						for(i=n-1;i>y;i--) {
//							if(a[x][i]==1) {
//								break;
//							}
//						}if(i==y) {System.out.println("find "+len.get(key));ans+=len.get(key);find=true;}
//						break;
//					} // end switch
//					if(find)
//						break;
//				}
//			}
//			System.out.println(ans);
//		}
	
	}

}
