package qlcoder.task758a;

import java.util.HashMap;
import java.util.Map;

public class Gen {
	private static final long twist(long u, long v) {
		return (((u & 0x80000000L) | (v & 0x7fffffffL)) >> 1) ^ ((v & 1) == 1 ? 0x9908b0dfL : 0);
	}
	private long[] state= new long[624];
	private int left = 1;
	public Gen() {
		for (int j = 1; j < 624; j++) {
			state[j] = (1812433253L * (state[j - 1] ^ (state[j - 1] >> 30)) + j);
	        state[j] &= 0xffffffffL;
		}
	}
	public void next_state() {
	    int p = 0;
	    left = 624;
	    for (int j = 228; --j > 0; p++) 
	        state[p] = state[p+397] ^ twist(state[p], state[p + 1]);

	    for (int j=397;--j>0;p++) 
	        state[p] = state[p-227] ^ twist(state[p], state[p + 1]);

	    state[p] = state[p-227] ^ twist(state[p], state[0]);
	}

	public long next() {
	    if (--left == 0) next_state();
	    return state[624-left];
	}
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		Map<Long, Long> total = new HashMap<Long, Long>();
		Gen rand=new Gen();
		Long max = 0L;
		Long temp = 0L;
		Long id = 0L;
		for(long i=0, j=9000000L;i<9000000L ;i++,j--)
//		for(long i=0;i<5000000000L;i++)
		{
			long num = rand.next();
			if(total.containsKey(num)){
				total.put(num, total.get(num)+1L);
			}else{
				total.put(num, 1L);
			}
			if(max < total.get(num)){
				max = total.get(num);
				id = num;
			}else if(temp < total.get(num)){
				temp = total.get(num);
				if((max-temp)>j){
					break;
				}
			}
		}
		System.out.println("id:"+id +"\nappear:" + max);
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000f + " seconds");
	}
}
