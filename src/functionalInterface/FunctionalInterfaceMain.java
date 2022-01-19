package functionalInterface;
import java.lang.FunctionalInterface;
import java.util.Calendar;
import java.util.Date;

@FunctionalInterface
interface AgeCalculator{
    int calculate(int year);
}
public class FunctionalInterfaceMain{
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        AgeCalculator age = (int x) -> Calendar.getInstance().get(Calendar.YEAR) -  x;

        int myAge = age.calculate(1997);
        System.out.println("Age is "+myAge);

    }
}
