package algorithm;

public class Prime_number_judgment {
	
	//根据概念判断:
	public boolean isPrime1(int n){
		if(n < 2) return false;
		for(int i = 2; i < n; ++i)
			if(n%i == 0) return false;
		return true;
	}
	
	//去掉偶数的判断:
	public boolean isPrime2(int n){
		if(n < 2) return false;
		if(n == 2) return true;
		if(n%2==0) return false;
		for(int i = 3; i < n; i += 2)
			if(n%i == 0) return false;
		return true;
	}
	
	//数学定理：
	/**定理: 如果n不是素数, 则n有满足1< d<=sqrt(n)的一个因子d.
		证明: 如果n不是素数, 则由定义n有一个因子d满足1< d< n.
		如果d大于sqrt(n), 则n/d是满足1< n/d<=sqrt(n)的一个因子.*/
	public boolean isPrime3(int n){
		if(n < 2) return false;
		if(n == 2) return true;
		if(n%2==0) return false;
		for(int i = 3; i*i <= n; i += 2)
			if(n%i == 0) return false;
		return true;
	}
	
	//剔除因子中的重复判断.
	/**定理: 如果n不是素数, 则n有满足1< d<=Math.sqrt(n)的一个"素数"因子d.
	证明: I1. 如果n不是素数, 则n有满足1< d<=Math.sqrt(n)的一个因子d.
	I2. 如果d是素数, 则定理得证, 算法终止.
	I3. 令n=d, 并转到步骤I1.
	由于不可能无限分解n的因子, 因此上述证明的算法最终会停止.
	// primes是递增的素数序列: 2, 3, 5, 7, ...
	// 更准确地说primes序列包含1->Math.sqrt(n)范围内的所有素数
	 * */
	public boolean isPrime4(int[] primes, int n){
		if(n < 2) return false;
		for(int i = 0; primes[i]*primes[i] <= n; ++i)
			if(n%primes[i] == 0) return false;
		return true; 
	}
	//构造素数序列primes: 2, 3, 5, 7, ...
	/**由4的算法我们知道, 在素数序列已经被构造的情况下, 判断n是否为素数效率很高;
	下面程序可以输出素数表.*/	
	public static int[] getPrimeNums(int maxNum){
		int[] primeNums = new int[maxNum/2+1];
		int sqrtRoot;
		int cursor = 0;
		boolean isPrime;
		for(int i=2;i<=maxNum;i++){
			sqrtRoot = (int)Math.sqrt(i); //取平方根
			isPrime = true;
			for(int j=0;j< cursor;j++){
				if(primeNums[j]>sqrtRoot)
					break;
				if(i%primeNums[j]==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				primeNums[cursor++] = i;
			}
		}
		int[] result = new int[cursor];
		System.arraycopy(primeNums,0,result,0,cursor);
		return result;
	}
	/*//测试代码
	 * public static void main(String[] args) throws Exception{
			int maxNum = Integer.parseInt(args[0]);
			int[] primeNums = getPrimeNums(maxNum);
			System.out.println("共"+primeNums.length+"个素数");
			for(int i=0;i< primeNums.length;i++){
				System.out.print(primeNums[i]+",\t");
	}*/

	//(在素数表中)二分查找
	/**Arrays.BinarySearch方法:
	该方法用于在指定数组中查找给定的值，采用二分法实现，所以要求传入的数组已经是排序了的。
	该方法的基本语法格式为：
	Static int binarySearch(byte[] a, byte key)
	该方法返回数据中key元素所在的位置，如果没有key元素，则返回key应插入的位置：-（insertion point-1），如数组中的第一个元素就大于key，返回-1。
	注：数组的数据类型可以是int[] byte[] short[] float[] long[] double[] char[] Object[]类型。*/
	
}

		

