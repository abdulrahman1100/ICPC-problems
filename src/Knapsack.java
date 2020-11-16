package Specialists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class knapsack2 {
	
	static int [] weights,values;
	static int n,w;
	static long [][]dp;
	public static  long knapsack(int index,int w) {
		
		if(w<0) {
			return -(int)1e9;
		}
		
		if(index==-1) {
			return 0;
			
		}
		
		if(dp[index][w]!=-1) {
			return dp[index][w];
		}
		
		
		int  x=weights[index];
		long take=values[index]+knapsack(index-1,(w-x));
		long leave=knapsack(index-1,w);
		
		return dp[index][w]=Math.max(take,leave);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		n =sc.nextInt();
		w=sc.nextInt();
		dp=new long [n+1][w+1];
		for(long m[]:dp) {
			Arrays.fill(m,-1);
		}
		
		weights=new int [n];
		values=new int [n];
		for (int i = 0; i < n; i++) {
			weights[i]=sc.nextInt();
			values[i]=sc.nextInt();
					
					
			
		}
		
		long result=knapsack(n-1,w);
		System.out.println(result);
		
		
		

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
