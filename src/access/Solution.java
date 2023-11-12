package access;

import java.util.Scanner;

public class Solution
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = Integer.parseInt(scanner.nextLine());
    Solution solution = new Solution();
    solution.new Inner().powerOf2(num);


  }

  private class Inner
  {
    void powerOf2(int num)
    {
      Inner inner = new Inner();
      assert num != 1073741824 : "The range is invalid!";
      assert num >= 0 : "The number cannot be negative!";
      assert isPowerOfTwo(num) : "The number is not divide of 2!";
      System.out.printf("%d is power of 2%n", num);
      System.out.printf("An instance of class: %s has been created", inner.getClass().getCanonicalName());
    }

    private boolean isPowerOfTwo(int num)
    {
      if (num == 0) {
        return false;
      }

      while (num != 1) {
        if (num % 2 != 0) {
          return false;
        }
        num = num / 2;
      }
      return true;
    }
  }
}
