package list.basicOperations.sumNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    private List<Integer> numbers;

    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(Integer number) {
        this.numbers.add(number);
    }

    public int sumNumbers() {
        var sum = 0;

        if (this.numbers.isEmpty()) {
            return sum;
        }

        for (int n : this.numbers) {
            sum += n;
        }

        return sum;
    }

    public int findGreatestNumber() {
        var max = 0;

        for (int n : this.numbers) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public int findLeastNumber() {
        int min = 0;

        if ( this.numbers.isEmpty() ) {
            return 0;
        }

        for (int i = 0; i < this.numbers.size(); i++) {
            var n = this.numbers.get(i);

            if (i == 0 || n < min) {
                min = n;
            }
        }

        return min;
    }

    public List<Integer> showNumbers() {
        return this.numbers;
    }

    @Override
    public String toString() {
        return "SumNumbers{" +
                "numbers=" + numbers +
                '}';
    }

    public static void main(String[] args) {
        var numbers = new SumNumbers();

        var min = numbers.findLeastNumber();
        System.out.printf("Menor valor é: %d\n", min);

        var max = numbers.findGreatestNumber();
        System.out.printf("Maior valor é: %d\n", max);

        numbers.addNumber(9);
        numbers.addNumber(5);
        numbers.addNumber(2);
        numbers.addNumber(10);
        numbers.addNumber(3);
        numbers.addNumber(8);

        min = numbers.findLeastNumber();
        System.out.printf("Menor valor é: %d\n", min);

        max = numbers.findGreatestNumber();
        System.out.printf("Maior valor é: %d\n", max);

        var list = numbers.showNumbers();
        System.out.println(list);

        var sum = numbers.sumNumbers();
        System.out.printf("Soma dos números é %d\n", sum);
    }
}
