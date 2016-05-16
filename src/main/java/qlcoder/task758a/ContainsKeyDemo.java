package qlcoder.task758a;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int num;
        for(int i=0; i<1000; i++){
        	num = (int) Math.round((Math.random()*25));
        	if(map.containsKey(num)){
        		map.put(num, map.get(num)+1);
        	}else{
        		map.put(num, 1);
        	}
        }
        int max=0;
        int id =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        	if(max < entry.getValue()){
        		max = entry.getValue();
        		id = entry.getKey();
        	}
        	System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(id+": " +max);
	}

}
