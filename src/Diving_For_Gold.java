import java.util.*;
import java.io.*;

public class Diving_For_Gold {
	
	static int []d,v;
	static int n,t,w;
	static int dp[][];
	static StringBuilder sb;
	static int count=0 ;
	static int result[]=new int[n+1];
	
	public static int f(int index,int remt) {
		
		
		if(index==n)
			return 0;
		
		int value=(w*d[index])+(2*w*d[index]);
		
		if(remt<0) {
			return -(int)1e9;
		}

		int take=v[index]+f(index+1,remt-(value));
		
		int leave=f(index+1,remt);

		return Math.max(take,leave);
	}
	
	public static void trace(int idx, int remt) {
	if (idx == n)
		return;
	if (f(idx, remt) == f(idx + 1, remt)) {
		trace(idx + 1, remt);
	} else {
		count++;
		sb.append(d[idx] + " "+v[idx]+"\n");
		int value=(w*d[idx])+(2*w*d[idx]);
		trace(idx + 1, remt - value);
	}
}
	
	public static void print(int []x) {
		for(int a:x) {
			System.out.print(a+" ");
		}
	}
	public static void main (String []args) throws IOException {
		Scanner sc=new Scanner (System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		t= sc.nextInt();
		sb = new StringBuilder();
		 w=sc.nextInt();
		 n=sc.nextInt();
		 d=new int[n];
		 v=new int[n];
		 
		 for(int i=0;i<n;i++) {
				d[i]=sc.nextInt();
				v[i]=sc.nextInt();
				
			}
		 
		    trace(0,t);
		    if(n<=30&&t<=1000) {
		    	
		    	pw.println(f(0,t));
			    
				pw.println(count);
				pw.println(sb);
				pw.close();
		    }
		    	


		
	}
	
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}

}
