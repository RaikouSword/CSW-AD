package ch17;
import java.util.*;
import java.util.function.Function;
public class Q1{
    public static void main(String args[]){
        List<Integer>numbers = List.of(1,2,3,4,5);
        List<Integer>squaredNumbers = map(numbers, x -> x*x);
        System.out.println("Squared Numbers: "+squaredNumbers);
        int sum = sum(numbers);
        System.out.println("Sum of numbers: "+sum);
    }
    public static <T,R> List<R> map(List<T> list , Function<T,R> mapper){
        List<R> result = new ArrayList<>();
        for(T item : list){
            result.add(mapper.apply(item));
        }
        return result;
    }
    public static int sum(List<Integer> numbers){
        int result =0;
        for(int number: numbers){
            result += number;
        }
        return result;
    }
}
