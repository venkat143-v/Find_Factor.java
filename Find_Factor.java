public class Find_Factor {
	public static void main(String[] args) {
		long n = 20;
		long p = 3;
		// write code
		// factors
		long k=0; // element
		for(long i=1; i <= n; i++)
		{
			if (n%i == 0) // 1 , 2 ,4, 5, 10
				k = k+1; // k=3
			if (k == p) // 3==3 -> t
			{
				System.out.println(i); // return i;
				break;
			}				
		}
       if(p>k)
    	   System.out.println(0);
	} }