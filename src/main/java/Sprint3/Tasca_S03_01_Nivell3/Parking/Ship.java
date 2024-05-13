package Sprint3.Tasca_S03_01_Nivell3.Parking;

public class Ship extends Vehicle {
    public Ship(String brand, String color, int price) {
        super(brand, color, price);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
