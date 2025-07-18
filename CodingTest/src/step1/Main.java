package step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		for(int i =0; i<n; i++) {
			array[i]  = Integer.parseInt(st.nextToken());
			
		}
		int max = array[0];
		int min = array[0];
		
		for (int i =0; i< array.length; i++) {
			if(array[i] > max)
				max= array[i];
			if(array[i] < min)
				min = array[i];
		}
		
		bw.write(min + "  " + max);
		bw.flush();
		bw.close();
		
	}
}