package qlcoder.task758a;

import java.util.BitSet;

public class BitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3000000;
		BitSet bitSet = new BitSet(count);
		int num;
		for(int i=0; i<count; i++){
			num = (int) Math.round((Math.random()*100000));
			bitSet.set(num, true);
		}
		
		for(int i=0; i<bitSet.size(); i++){
			if(bitSet.get(i)){
				System.out.println(i);
			}
		}

	}

}
