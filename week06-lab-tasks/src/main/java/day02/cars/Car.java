package day02.cars;

public class Car {
    public String carBrand;
    public double engineV;
    public Color color;
    public int price;

    public Car(String carBrand, double engineV, Color color, int price) {
        this.carBrand = carBrand;
        this.engineV = engineV;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent){
        price = (int) (price * (1 - percent / 100.0));
    }

    public String getCarBrand() {
        return carBrand;
    }

    public double getEngineV() {
        return engineV;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
