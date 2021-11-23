package day02.cars;

//import org.junit.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CarShopTest {
    Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
    CarShop carShop = new CarShop("Best Car", 10_000_000);

    @Test
    public void testCreate(){
        assertTrue(carShop.addCar(car1));
    }

    @Test
    public void testCreate2(){
        carShop.addCar(car1);
        assertEquals(1,carShop.getCarsForSell().size());
    }
    @Test
    public void testCreate3(){
        assertFalse(carShop.addCar(car2));
    }

    @Test
    public void testCreate4(){
        carShop.addCar(car2);
        assertEquals(0,carShop.getCarsForSell().size());
    }

}
