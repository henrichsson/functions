public class Factorization
{	
	public int two_count(int n)
	{
		if(n >= 1)
		{
			int twos = 0;
			    
			for (int i = 2; i <= n; i++)
			{
				while (n % i == 0)
			    {
					if(i == 2)
			    	{
						twos++;
			    	}		    	
			        n /= i;
			    }
			}
			
			return twos;
		}
		
		else
		{
			return -1;
		}
	}
}