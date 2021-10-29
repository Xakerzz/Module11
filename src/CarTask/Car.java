package CarTask;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String name;
    private boolean isOnSale;

    public Car(String brand, String name, boolean isOnSale) {
        if (brand == null || name == null){
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.isOnSale = isOnSale;
    }

    public String getBrand() {
        return brand;
    }



    public String getName() {
        return name;
    }



    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", isOnSale=" + isOnSale +
                '}';
    }
}
