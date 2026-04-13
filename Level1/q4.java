import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            arr[index] = num;
            index++;
            if (index == 10) {
                break;
            }
        }
        System.out.println("\nEntered values:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }
        System.out.println("Sum = " + total);
    }
}