package functionalInterface;

import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Double> randomNumber = () -> Math.random();
        // T get
        System.out.println("random number is : "+randomNumber.get());
    }
}
