import java.util.List;
import java.util.ArrayList;

public class Fibonacci {

        public static void main(String[] args) {
            List<Integer> fibonacciSeries = generateFibonacciSeries(4500);
            List<Integer> evenFibonacciNumbers = filterEvenNumbers(fibonacciSeries);

            System.out.println("Deret Fibonacci Genap: " + evenFibonacciNumbers);
            System.out.println("Total bilangan Fibonacci genap: " + evenFibonacciNumbers.size());
            System.out.println("Jumlah bilangan Fibonacci genap: " + calculateSum(evenFibonacciNumbers));
        }

        public static List<Integer> generateFibonacciSeries(int limit) {
            List<Integer> fibonacciSeries = new ArrayList<>();
            fibonacciSeries.add(0);
            fibonacciSeries.add(1);

            int currentFibonacciNumber = 1;
            while (currentFibonacciNumber <= limit) {
                fibonacciSeries.add(currentFibonacciNumber);
                currentFibonacciNumber = fibonacciSeries.get(fibonacciSeries.size() - 1) + fibonacciSeries.get(fibonacciSeries.size() - 2);
            }

            return fibonacciSeries.subList(2, fibonacciSeries.size());
        }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
