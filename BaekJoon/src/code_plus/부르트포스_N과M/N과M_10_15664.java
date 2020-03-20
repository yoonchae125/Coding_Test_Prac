package code_plus.부르트포스_N과M;

import java.util.*;

public class N과M_10_15664 {
	static int[] a = new int[10];
    static int[] num = new int[10];
    static int[] cnt = new int[10];
    public static void go(int n,int m,int start, int idx) {
    	if(idx==m) {
    		for (int i=0; i<m; i++) {
                System.out.print(num[a[i]] + " ");
            }
            System.out.println();
            return;
    	}
    	for(int i=start;i<n;i++) {
    		if(cnt[i]>0) {
    			cnt[i]-=1;
    			a[idx] = i;
    			go(n,m,i,idx+1);
    			cnt[i]+=1;
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int temp[] = new int[n];
		for(int i =0;i<n;i++) {
			temp[i]=sc.nextInt();
		}
		Arrays.sort(temp);
		int k=0;
		int c=1;
		int x = temp[0];
		
		for(int i=1;i<n;i++) {
			if(x==temp[i]) {
				c+=1;
			}else {
				num[k]=x;
				cnt[k]=c;
				c=1;
				k+=1;
				x=temp[i];
			}
		}
		num[k]=x;
		cnt[k]=c;
		n=k+1;
		go(n,m,0,0);
	}

}
