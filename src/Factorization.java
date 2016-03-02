public class Factorization
{	
	public int two_count(int n)
	{
		if(n >= 1)
		{
			int twos = 0;
			
			while (n % 2 == 0)
			{
				twos++;					
			    n /= 2;
			}
			
			return twos;
		}
		
		else
		{
			return -1;
		}
	}
}