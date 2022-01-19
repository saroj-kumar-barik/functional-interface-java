package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceMain {
    public static void main(String[] args) {
        Consumer<Integer> randomNumber =
                (x) -> System.out.println("Random number between 1 to "+x +" is = "+Math.random() * x + 1);
        // accept is the one of the default methods of functional interface
        randomNumber.accept(10);

        // ====================================

        Student s = new Student("bablu", 24);
        Student s1 = new Student("saroj", 12);
        Student s2 = new Student("kumar", 26);
        List<Student> students = new ArrayList<>();
        students.add(s);
        students.add(s1);
        students.add(s2);


        System.out.println("result from students list : ");
        // Consumer taking List<> as type
        Consumer<List<Student>> listConsumer = list -> {
            for (Student student : students){
                System.out.println(student.name);
                System.out.println(student.age);
            }
        };

        listConsumer.accept(students);

        // addThen with exception handling :
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i <= list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of integers
        Consumer<List<Integer> >
                dispList = list -> list.forEach(a -> System.out.print(a + " "));
        System.out.println();

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        // using addThen()
        System.out.println("using addThen ()");
//        modify.andThen(dispList).accept(list);
        try {

            System.out.println("using addThen () with  handling :" );
            dispList.andThen(modify).accept(list);

        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}


class Student{
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
