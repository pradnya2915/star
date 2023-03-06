package Stars;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PyramidNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader keyword=new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("Enter number:");
		int a=Integer.parseInt(keyword.readLine());
		System.out.println("Enter X:");
		int X=Integer.parseInt(keyword.readLine());
		int y=0;
		for(int i=0;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(y+"\t");
				y=y+X;
			}
			System.out.println("");
		}
	
		
	}
}
