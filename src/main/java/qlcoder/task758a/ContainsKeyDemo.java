package qlcoder.task758a;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int num;
        int count = 900000000;
        int max=0, temp=0;
        int id =0;
        long start = System.currentTimeMillis();
        for(int i=0; i<count; i++){
        	num = (int) Math.round((Math.random()*2));
        	if(map.containsKey(num)){
        		map.put(num, map.get(num)+1);
        		if(max < map.get(num)){
        			max = map.get(num);
        			id = num;
        		}else if(temp < map.get(num)){
        			temp = map.get(num);
        			if((max - temp) > count-i){
        				break;
        			}
        		}
        	}else{
        		map.put(num, 1);
        	}
        }
        System.out.println("id: "+ id);
        System.out.println("value" + max);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000f + " seconds");
	}

}
