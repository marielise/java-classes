public class HalfExampleWithMethod {

  public static void main(String[]args) {

    int monster1LifePoint = 250;
    int monster2LifePoint = 500;
    int monster3LifePoint = 240;    //this is a game with only 3 monsters
    int attacksStrength = 21;  // at start ?

    attacksStrength = killMonster(monster1LifePoint, attacksStrength, "Monster 1");
    attacksStrength = killMonster(monster2LifePoint, attacksStrength, "Monster 2");
    attacksStrength = killMonster(monster3LifePoint, attacksStrength, "Monster 3");

    //now we can improve our game to move around with keyboard

    //we can move on a grid and encounter monsters

  }

  public static boolean computeRandom() { //that's a method
    //compute random
    double randomValue = Math.random();
    if(randomValue < 0.5) {
      return false;
    } else {
      return true;
    }
  }

  public static int attackMonster(int monsterLife, int attacksStrength) {   //that's a method
    boolean attackWorked = computeRandom();
    // player attack monster
    if (attackWorked) {
      //decrease monster points
      monsterLife = monsterLife - attacksStrength;
      System.out.println("monster life " + monsterLife);
    } else {
      //show missed
      System.out.println("Missed");
    }
    return monsterLife;
  }

  public static int killMonster(int startMonsterLife, int attacksStrength, String monsterName) {
    int monsterLife = startMonsterLife;
    int numberOfAttacks = 0;

    while (monsterLife > 0) { // while the monster is alive, attack
      monsterLife = attackMonster(monsterLife, attacksStrength);
      numberOfAttacks = numberOfAttacks + 1;
    }

    System.out.println("Monster "+ monsterName + " killed");

    //now the monster is dead , compute the new attack strength and send it back to the main program
    //the more attack you needed, the less the strength grows
    int newStrength = ((100 - numberOfAttacks) / 100 * attacksStrength) + attacksStrength;

    System.out.println("new attack strength is " + newStrength);
    return newStrength;

  }
}
