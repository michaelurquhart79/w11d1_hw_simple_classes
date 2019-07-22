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


//    Water Bottle
//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.