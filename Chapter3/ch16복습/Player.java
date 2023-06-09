package Chapter3.ch16복습;

public class Player {

  private PlayerLevel level;

  public PlayerLevel getLevel() {
    return level;
  }

  public Player() {
    level = new BeginnerLevel();
    level.showLevelMessage();
  }

  public void upgradeLevel(PlayerLevel level) {
    this.level = level;
    level.showLevelMessage();
  }

  public void play(int count) {
    level.go(count);
  }

}
