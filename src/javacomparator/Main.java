package javacomparator;

import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of players: ");
    int n = Integer.parseInt(scanner.nextLine());
    Player[] players = new Player[n];
    enterPlayers(n, players, scanner);
    checkForScore(players);
  }

  private static void checkForScore(Player[] players)
  {
    Arrays.sort(players, new Checker());
    Collections.reverse(Arrays.asList(players));

    for (Player player : players) {
      System.out.println(player.toString());
    }
  }

  private static Player[] enterPlayers(int n, Player[] players, Scanner scanner)
  {
    for (int i = 0; i < n; i++) {
      System.out.print("Enter name: ");
      String name = scanner.nextLine();
      System.out.print("Enter score: ");
      int score = Integer.parseInt(scanner.nextLine());
      Player player = new Player(name, score);
      players[i] = player;
    }
    return players;
  }
}
