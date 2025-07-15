package step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main2 {
	public static void main(String args[]) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int B;
		int A;
		
 
		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": ");
			bw.write(A + " + " + B + " = " + (A+B) + "\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
		}
}