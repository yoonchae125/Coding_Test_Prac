
public class SkillCheck3_1 {
	public static long d[];
	public static long solution(int N) {
        long answer = 0;
        d = new long[N+1];
        d[0]=0;
        d[1]=1;
        for(int i=2;i<=N;i++) {
        	d[i]=d[i-1]+d[i-2];
        }
        
        answer = 2*(d[N]+d[N]+d[N-1]);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5));
	}

}
