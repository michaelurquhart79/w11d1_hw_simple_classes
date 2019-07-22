import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasInitialVolumeOf100(){
//        WaterBottle waterbottle = new WaterBottle();
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canTakeADrink(){
        waterbottle.takeDrink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canTakeTwoDrinks(){
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}

