import org.junit.*;
import static org.junit.Assert.*;

public class ScoresTest
{
	private Scores s;
	
	@Before
	public void SetUp()
	{
	    s = new Scores();	     
	}
	
	@Test
	public void TestInequality()
	{
		assertNotEquals(49, s.nscORe(49));
	}
	
	@Test
	public void TestNegative_1()
	{
	 assertEquals(-1, s.nscORe(-1));
	}
	
	@Test
	public void TestNegative_2()
	{
	 assertEquals(-1, s.nscORe(-1604));
	}
	
	@Test
	public void TestSubject_1()
	{
	 assertEquals(63, s.nscORe(49));
	}
	
	@Test
	public void TestSubject_2()
	{
	 assertEquals(1048575, s.nscORe(1000000));
	}	
	
	@Test
	public void TestMultipleSubjectsArray()
	{
		int testData[] = {0,1,3,5,7,9,11,13,15,17,19,20};		
		int expectedResults[] = {0,1,3,7,7,15,15,15,15,31,31,31};
		
		for(int i=0; i < testData.length; i++)
		{
			assertEquals(expectedResults[i], s.nscORe(testData[i]));
		}
	}
	
	@After
	public void TearDown()
	{
		s = null;
	}
}