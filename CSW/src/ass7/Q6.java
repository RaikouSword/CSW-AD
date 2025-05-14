import java.util.function.Function;
public class Q6{
    public static void main(String[] args){
        Function <Integer, Long> factorialFunction = getFactorialFunction();
        int[] nums = {0,1,5,7,10};
        for(int num: nums){
            System.out.println("Factorial of "+ num+" is "+ factorialFunction.apply(num));
        }
    }
    public static Function<Integer,Long> getFactorialFunction(){
        return (Integer n) ->{
            long result = 1;
            for(int i = 2; i <=n;i++){
                result = result * i;
            }
            return result;
        };
    }
}