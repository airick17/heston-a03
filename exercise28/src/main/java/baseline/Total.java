package baseline;
import java.util.Scanner;
import java.util.stream.*;

public class Total {

    //array to store numbers
    int[] numbers = new int[5];

    public void getNumbers() {
        //for loop 5 times
        //gets input from user
        //stores in numbers array
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void printTotal() {
        //totals array and prints to user
        int sum = IntStream.of(numbers).sum();
        System.out.printf("The total is %s.", sum);
    }
}



