/**
 * Created by Craig on 3/23/2016.
 */
import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.Test;
import static org.mockito.Mockito.*;
public class test {
    @Test
    public void testDrinkSugarTester()
    {
        Drink drink = mock(Drink.class);
        when (drink.getSugar()).thenReturn(true);
    }

    @Test
    public void testDrinkSugarCreamCoffee()
    {
        Drink drink = new Drink();
        drink.look(0);
        drink.look(2);
        drink.look(5);
        assertTrue(drink.drinkCoffee());

    }
    //Makes sure you fail whne you drink just sugar and cream
    @Test
    public void testDrinkSugarCream()
    {
        Drink drink = new Drink();
        drink.look(0);
        drink.look(5);
        assertFalse(drink.drinkCoffee());
    }
}
