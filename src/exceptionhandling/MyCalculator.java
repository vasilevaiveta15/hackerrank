package exceptionhandling;

public class MyCalculator
{
  long power(int n, int p)
  {
    if (p < 0 || n < 0) {
      throw new IndexOutOfBoundsException("n or p should not be negative");
    }
    if (p == 0 || n == 0) {
      throw new IndexOutOfBoundsException("n or p should not be zero");
    }
    return (long) Math.pow(n, p);
  }
}
