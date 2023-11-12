package exceptionhandling;

import java.util.Scanner;

public class MainCalculator
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    MyCalculator myCalculator = new MyCalculator();


    for (int i = 0; i < 5; i++) {
      try {
        System.out.print("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter p: ");
        int p = Integer.parseInt(scanner.nextLine());
        long sum = myCalculator.power(n, p);
        System.out.println(sum);
      }
      catch (IndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
      }
    }

  }
}
