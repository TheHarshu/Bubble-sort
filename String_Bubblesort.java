import java.util.Scanner;

public class BubbleSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 strings
        String[] strings = new String[10];
        System.out.println("Please enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the array of strings using the bubble sort algorithm
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        // Print the sorted array of strings to the console
        System.out.println("The sorted strings are:");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
              }
                               
