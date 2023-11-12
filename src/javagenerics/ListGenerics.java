package javagenerics;

import java.util.List;

public class ListGenerics<T>
{
  public static <T extends Comparable> T getMinElement(List<T> list)
  {
    T min = null;
    for (T element : list) {
      if (min == null) {
        min = element;
        continue;
      }
      if (element.compareTo(min) < 0) {
        min = element;
      }
    }
    return min;
  }

  public static <T extends Comparable> T getMaxElement(List<T> list)
  {
    T max = null;
    for (T element : list) {
      if (max == null) {
        max = element;
      }
      if (element.compareTo(max) > 0) {
        max = element;
      }
    }
    return max;
  }
}
