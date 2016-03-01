public class Scores
{
	public int nscORe(int n)
	{
		int score;
		
		if(n >= 0)
		{
			score = 0;
			
			for(int i = 0; i < n; i++)
			{	
				score = score | (i+1);		
			}		
			
			return score;
		}
		
		else
		{
			return -1;
		}
	}
}