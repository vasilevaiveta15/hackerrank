package javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
    List<String> names = new ArrayList<>();
    names.add("Iveta");
    names.add("Krasimir");
    names.add("Anna");
    System.out.println("The longest name is: " + ListGenerics.getMinElement(names));
    System.out.println("The shortest name is:  " + ListGenerics.getMaxElement(names));

    List<Integer> numbers = new ArrayList<>();
    numbers.add(12);
    numbers.add(16);
    numbers.add(13);
    System.out.println("The biggest number is: " + ListGenerics.getMinElement(numbers));
    System.out.println("The smallest number is: " + ListGenerics.getMaxElement(numbers));
  }
}
