package javacomparator;

import java.util.Comparator;

public class Checker implements Comparator<Player>
{
  @Override
  public int compare(Player player1, Player player2)
  {
    if (player1.getScore() != player2.getScore()) {
      return Integer.compare(player1.getScore(), player2.getScore());
    }
    return player2.getName().compareTo(player1.getName());
  }
}
