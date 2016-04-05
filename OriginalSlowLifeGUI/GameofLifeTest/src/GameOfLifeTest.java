//Craig Kodman..my test file

import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.Test;
//import static org.mockito.Mockito.*;


public class GameOfLifeTest {
	//private static final int MAX_VALUE = 0;
	//Drink drinkTester;
	//Move moveTester;
	OriginalMain om = new OriginalMain(1);
	MainPanel mp = new MainPanel(1);
	CellOriginal co = new CellOriginal();
	Cell cell = new Cell();
	public int _r = 1000;
	public int testConvert1;
	public int testConvert2;
	//Mocks Drink and stubs getSugar

	@Test
	public void testConvertToIntFixint()  
	{
		int x = om.convertToInt(10);
		int y = mp.convertToInt(10);
		assertEquals(x,y);
		//(convertToIntFixint(10),convertToIntOriginal(10));
	}
	@Test
	public void testConvertToIntFixintNeg()  
	{
		int x = om.convertToInt(-1);
		int y = mp.convertToInt(-1);
		assertEquals(x,y);
	}
	@Test
	public void testConvertToIntFixintMax()  
	{
		int x = om.convertToInt(Integer.MAX_VALUE);
		int y = mp.convertToInt(Integer.MAX_VALUE);
		assertEquals(x,y);
	}
	@Test 
	public void testToString(){
		assertEquals(co.toString(), cell.toString());
	}
	@Test
	public void testToStringX(){
		co.setAlive(true);
		cell.setAlive(true);
		assertEquals(co.toString(), cell.toString());
	}
	@Test
	public void testToStringPeriod(){
		co.setAlive(false);
		cell.setAlive(false);
		assertEquals(co.toString(), cell.toString());
	}
	

}
