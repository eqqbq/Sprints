package Sprint3.Tasca_S03_01_Nivell3.Parking;

public class Car extends Vehicle {
    public Car(String brand, String color, int price) {
        super(brand, color, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
