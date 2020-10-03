import java.util.*;
import java.io.*;

public class Divisibility {
	
	static int input [];
	static int m,k,n;
	static int result=0;
	static String dp[];
//	public static boolean tr(int index,int s) {
//		
//		if(index==n) {
//			s=0;
//			return false;
//		}
//			
//		if(s%k==0)
//			return true;
//		
//		boolean plus=tr(index+1,s+input[index]);
//		boolean minus=tr(index+1,s-input[index]);
//		boolean res=plus||minus;
////		System.out.println("index: "+index+" input[index]: "+input[index]+" plus: "+plus+" minus: "+minus+" s: "+s);
//		return res;
//		
//	}
	public static int tr(int index) {
		
		
		if(index<n) {
			
			int plus=input[index]+tr(index+1);
			int minus=input[index]-tr(index+1);
			
			if(index==n-1) {
				if(Math.abs(plus)%k==0)
					return result=plus;
				if(Math.abs(minus)%k==0)
					return result=minus;
			}
		}
		return result;
		
		
	}
	public static void print(int []arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void print2(String []arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main (String[]args) throws IOException {
		
		Scanner sc=new Scanner (System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		m=sc.nextInt();
		n=sc.nextInt();
		k=sc.nextInt();
		dp=new String[n];
		input=new int[n];
		for (int i = 0; i <n; i++) {
			input[i]=sc.nextInt();
		}
//		pw.print(tr(0,input[0]));
		pw.print(tr(0));
		pw.close();
		print(input);
		
		
		
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

