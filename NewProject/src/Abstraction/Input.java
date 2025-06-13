package Abstraction;

import java.io.*;
public class Input {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int a =Integer.parseInt(in.readLine());
	}

}
