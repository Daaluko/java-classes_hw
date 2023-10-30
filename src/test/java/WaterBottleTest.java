import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle buxton;
    WaterBottle emptyBuxton;

    @Before
    public void before(){
        buxton = new WaterBottle(100);
        emptyBuxton = new WaterBottle(0);
    }

    @Test
    public void canDrink(){
        assertEquals(0, buxton.drink());
    }


    @Test
    public void canFill(){
        assertEquals(100, emptyBuxton.fill());

    }
}
