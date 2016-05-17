package qlcoder.task7542;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class GoodCount {
	
	public static void main(String[] args) throws Exception {
		Long[] goods = new Long[100000];
		FileReader reader = new FileReader("src/main/resources/task75422/144043063958496.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String temp;
		String[] ss;
		Long result = 0L;
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
