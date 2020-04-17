package Samsung;

import java.util.*;

public class Q16235 {
	public static int dx[] = {-1,-1,-1,0,0,1,1,1};
	public static int dy[] = {-1,0,1,-1,1,-1,0,1};
	
	public static int N,M,K;
	public static int A[][]; // 겨울에 추가하는 양분 
	public static int nuts[][]; // 땅에 있는 양분의 양 
	public static ArrayList trees[][]; // (r,c)에 있는 나무 list 저장
	public static void springNsummer() {
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				// 나이만큼 양분 먹음 
				ArrayList<Integer> tree = trees[i][j];
				int nut = nuts[i][j];
				int idx=0;
				for(idx=0;idx<tree.size();idx++) {
					int age = tree.get(idx);
					if(nut>=age) {
						// 양분 먹음
						nut = nut-age;
						// 나이 먹음
						age = age+1;
						tree.set(idx, age); 
					}else { // 양분 부족 
						// 다 죽음 
						break;
					}
				}
//				System.out.println(tree.size());
				for(int k=idx;idx<tree.size();k++) {
//					System.out.println("idx"+idx);
					// 죽음
					int age = tree.remove(idx);
					// 양분 추가 (여름) 
					nut = nut+age/2;
					
				}
				nuts[i][j] = nut; // 양분 갱신 
			}
		}
		sortTreesByAge();
	}
//	public static void summer() {
//		
//	}
	public static void fall() {
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				// 나이만큼 양분 먹음 
				ArrayList<Integer> tree = trees[i][j];
				for(int age:tree) {
					if(age%5==0) { // 나이가 5배수면
						// 번식
						for(int d=0;d<8;d++) {
							int nx = i+dx[d];
							int ny = j+dy[d];
							if(nx<1||ny<1||nx>N||ny>N)
								continue;
							trees[nx][ny].add(1);
						}
					}
				}
			}
		}
		
		
		sortTreesByAge();
	}
	public static void winter() {
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				nuts[i][j]+=A[i][j];
			}
		}
	}
	public static void sortTreesByAge() {
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				Collections.sort(trees[i][j]);
			}
		}
	}
	public static int countTrees() {
		int count=0;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				count+=trees[i][j].size();
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		 
		A = new int[N+1][N+1];
		nuts = new int[N+1][N+1];
		trees = new ArrayList[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				A[i][j] = sc.nextInt();
				trees[i][j] = new ArrayList<Integer>(); 
				nuts[i][j] = 5;
			}
		}
		
		for(int i=0;i<M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int age = sc.nextInt();
			trees[x][y].add(age);
		}
		sortTreesByAge();
		
		while(K-->0) {
			springNsummer();
			fall();
			winter();
		}
		// output
		
		System.out.println(countTrees());
	}
	public static void printNut() {
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				System.out.print(nuts[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printTrees() {
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				ArrayList<Integer> tree = trees[i][j];
				for(int age:tree)
					System.out.println("("+i+", "+j+") age="+age);
			}
			System.out.println();
		}
//		System.out.println();
	}
}
