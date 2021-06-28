package algorithm;

import java.util.Arrays;

/**向一组有序的数中插入一个数；保证插入后数据还是有序的。显示插入数据的下标位置。*/

public class Insert_number {
	
	  /**
     * 在一组有序数中插入一个数
     * @param ns 是一个组有序数
     * @param value 需要插入到有序数中的数
     */
	 public static int insert1(int[] ns, int value) {
		 int[] ns1 = new int[ns.length+1];
		 for(int i = 0;i<ns.length;i++) {
			 ns1[i] = ns[i];
		 }
		 System.out.println("ns1: " + Arrays.toString(ns1));
	     int idx = 0;
	     for (int i = 0; i < ns1.length; ++i) {
	         if (ns1[i] >= value) { // 找到需要插入的位置
	        	 idx = i;
	             for (int j = ns1.length-1; j > i; --j) {
	                 ns1[j] = ns1[j - 1];
	             	}
	             ns1[i] = value;
	             break;
	         }
	     }
	     if(ns1[ns1.length-1]==0) {
        	 ns1[ns1.length-1] = value; 
         }
	     ns = ns1;
	     System.out.println("ns1: " + Arrays.toString(ns1));
	     System.out.println("ns: " + Arrays.toString(ns));//直接输出
	     return idx;
	 }
	 
	 
	 
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns = { 1,3,6,9,14,16,58,99};
        int value = 100;

        System.out.println("Before insert: " + Arrays.toString(ns));
        int x = insert1(ns, value);
        //System.out.println("After  insert: " + Arrays.toString(ns) + " 位置" + x);

	}

}
