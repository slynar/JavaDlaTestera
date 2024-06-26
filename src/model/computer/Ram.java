package model.computer;

import java.util.Objects;

public class Ram {

    private String brand;
    private int size;

    // Konstruktor:
    public Ram(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    // Gettery i settery:
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    // Metoda toString():
    @Override
    public String toString() {
        return "Ram{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }

    // Metody equals() and hashCode():
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram = (Ram) o;
        return size == ram.size && Objects.equals(brand, ram.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size);
    }
}
