package Sprint3.Tasca_S03_01_Nivell3.Parking;

public class Bycicle extends Vehicle {
    public Bycicle(String brand, String color, int price) {
        super(brand, color, price);
    }

    @Override
    public String toString() {
        return "Bycicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
