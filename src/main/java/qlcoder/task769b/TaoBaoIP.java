package qlcoder.task769b;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TaoBaoIP {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileReader ip = new FileReader("C:/Users/hasee/Downloads/qlcoder/ip.data");
		
		BufferedReader buff = new BufferedReader(ip);
		int temp;
		char[] b = new char[5];
		int[] a = new int[400000];
		int num=0;
		while((temp=buff.read()) != -1){
//			if(num==327681){
				System.out.println(temp);
//				break;
//			}
//			num++;
//			a[256*b[2]+b[3]] += 1;
//			if(b[2]!=0&&b[3]!=0)
//			System.out.println(256*b[2]+b[3]);
		}
		for (int i : a) {
//			System.out.println(i);
		}
		
		
		FileInputStream fis = new FileInputStream("C:/Users/hasee/Downloads/qlcoder/ip.data");
		BufferedInputStream bStr = new BufferedInputStream(fis);
		byte[] bb = new byte[5];
		while((temp=bStr.read()) != -1){
			if(num==9999+1){
			System.out.println(temp);
//			System.out.println(num);
			break;
			}
			num++;
		}
	}

}
