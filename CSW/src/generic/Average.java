package generic;

import java.util.List;

public class Average {

    public static <T extends Number> double average(List<T> numbers) {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println("Average of Integer List: " + average(intList));

        List<Double> doubleList = List.of(2.5, 3.5, 4.5, 5.5);
        System.out.println("Average of Double List: " + average(doubleList));

        List<Float> floatList = List.of(1.5f, 2.5f, 3.5f, 4.5f);
        System.out.println("Average of Float List: " + average(floatList));
    }
}

