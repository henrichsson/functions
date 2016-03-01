import org.junit.*;
import static org.junit.Assert.*;

public class FactorizationTest
{
	private Factorization f;
	
	@Before
	public void SetUp()
	{
		f = new Factorization();
	}
	
	@Test
	public void TestNegativeSubject()
	{
		assertEquals(-1, f.two_count(-1));
	}
	
	@Test
	public void TestZeroSubject()
	{
		assertEquals(-1, f.two_count(0));
	}
	
	@Test
	public void TestSubject_1()
	{
		assertEquals(0, f.two_count(123));
	}
	
	@Test
	public void TestSubject_2()
	{
		assertEquals(3, f.two_count(24));
	}
	
	@Test
	public void TestSubject_3()
	{
		assertEquals(7, f.two_count(17280));
	}
	
	@Test
	public void TestMultipleSubjectsArray()
	{
		int testData[] = {44,3,32,798,1001,1000,1024,2048,123321,32768};		
		int expectedResults[] = {2,0,5,1,0,3,10,11,0,15};
		
		for(int i=0; i < testData.length; i++)
		{
			assertEquals(expectedResults[i], f.two_count(testData[i]));
		}
	}
	
	@After
	public void TearDown()
	{
		f = null;
	}
}