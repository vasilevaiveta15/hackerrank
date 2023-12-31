package javacomparator;

public class Player
{
  private String name;
  private int    score;

  public Player(String name, int score)
  {
    this.name = name;
    this.score = score;
  }

  @Override
  public String toString()
  {
    return String.format("%s - %d", this.getName(), this.getScore());
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getScore()
  {
    return this.score;
  }

  public void setScore(int score)
  {
    this.score = score;
  }
}
