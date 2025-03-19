package generic;

public class CountOccurrences {

    public static <T> int countOccurrences(T[] array, T target) {
        int count = 0;
        for (T element : array) {
            if (element.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 2, 5, 2};
        System.out.println("Occurrences of 2 in intArray: " + countOccurrences(intArray, 2));

        String[] strArray = {"apple", "banana", "apple", "cherry", "apple"};
        System.out.println("Occurrences of 'apple' in strArray: " + countOccurrences(strArray, "apple"));

        Character[] charArray = {'a', 'b', 'c', 'a', 'a'};
        System.out.println("Occurrences of 'a' in charArray: " + countOccurrences(charArray, 'a'));
    }
}

