import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        System.out.println("\nComparison of first and last element:");
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}