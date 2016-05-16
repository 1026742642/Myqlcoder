package qlcoder.task753f;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class GoodCount {
	
	public static void main(String[] args) throws Exception {
		int[] goods = new int[1000];
		FileReader reader = new FileReader("src/main/resources/qlcoder/goodcount/144043123647536.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String temp;
		String[] ss;
		Integer result = 0;
		while((temp=bufferedReader.readLine()) != null){
			ss = temp.split(" ");
			String a1 = ss[0];
			Integer num1 = Integer.valueOf(ss[1]);
			Integer num2 = Integer.valueOf(ss[2]);
			switch (ss[0]){
				case "up":goods[num2] +=num1; 
					break;
				case "down":goods[num2] -= num1;
					break;
				case "query":
					for(int i=num1; i<=num2; i++){
						result += goods[i];
					}
			}
		}
		System.out.println(result);
	}

}
