package functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterfaceMain {
    public static void main(String[] args) {
        Function<Integer, Double> add = a -> a + 3.556;
        System.out.println(add.apply(10));

        add = add.andThen(a -> a * 3);
        System.out.println(add.apply(6));


        UnaryOperator<Integer> xor = a -> a ^ 1;
        UnaryOperator<Integer> and = a -> a & 1;
        // use of Function Interface
        Function<Integer, Integer> compose = xor.andThen(and);
        System.out.println(compose.apply(4));
    }
}
