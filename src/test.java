import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
	
	public static void print(int []x) {
		for(int a:x) {
			System.out.print(a+" ");
		}
	}
	public static void main (String[]args) throws IOException {
		
		int []x=new int [4];
		int []y=new int [4];
		Scanner sc=new Scanner (System.in);
	    for (int i = 0; i < y.length; i++) {
			y[i]=sc.nextInt();
			x[i]=sc.nextInt();
		}
	    print(y);
	    System.out.println();
	    print(x);
		
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


