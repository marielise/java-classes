public class StartUsingMethod {


  public static void main(String[]args) {

    int monster1LifePoint = 250;
    int monster2LifePoint = 500;
    int attacksStrength = 21;

    boolean attackWorked = computeRandom();

    monster1LifePoint = attackMonster(monster1LifePoint, attacksStrength);

    if (monster1LifePoint < 0 ) {

      //yeah, you kill the monster .... now go to the next one
      System.out.println("Monster 1 killed");

      monster2LifePoint = attackMonster(monster2LifePoint, attacksStrength);

    } else {
      //attack again
      monster1LifePoint = attackMonster(monster1LifePoint, attacksStrength);

      if (monster1LifePoint < 0) {
        //yeah, you kill the monster .... now go to the next one
        System.out.println("Monster 1 killed");

        monster2LifePoint = attackMonster(monster2LifePoint, attacksStrength);
      } else {

        //attack again monster 1
        monster1LifePoint = attackMonster(monster1LifePoint, attacksStrength);
      }

    }


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


}
