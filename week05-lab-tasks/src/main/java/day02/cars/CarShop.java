package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    public String name;
    public int maxPrice;
    public List<Car> CarsForSell = new ArrayList<>();

    public CarShop(String name, int price) {
        this.name = name;
        this.maxPrice = price;
    }

    public boolean addCar(Car car){
        if(car.price <= maxPrice){
            CarsForSell.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice(){
        int sumOfPrices = 0;
        for(Car c: CarsForSell){
            sumOfPrices += c.getPrice();
        }
        return sumOfPrices;
    }

    public int numberOfCarsCheaperThan(int price){
        int sumOfCars = 0;
        for(Car c: CarsForSell){
            if(c.getPrice() <= price){
                sumOfCars++;
            }
        }
        return sumOfCars;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> carsWithThatBrand = new ArrayList<>();
        for(Car c: CarsForSell){
            if(c.getCarBrand().equals(brand)){
                carsWithThatBrand.add(c);
            }
        }
        return carsWithThatBrand;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return CarsForSell;
    }
}
