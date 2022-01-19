package functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorMain {
    public static void main(String[] args) {
        // identity() returns the value itself
        UnaryOperator<Integer> op = UnaryOperator.identity();
        System.out.println(op.apply(5));

        UnaryOperator<Integer> random = (xor) ->  xor^1;
        System.out.println(random.apply(10));


    }
}
