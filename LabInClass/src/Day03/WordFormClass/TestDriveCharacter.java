package Day03.WordFormClass;

public class TestDriveCharacter {
    public static void main(String[] args) {
        Character king = new King();
        Character knight = new Knight();
        Character queen = new Queen();
        Character troll = new Troll();

        king.fight();
        knight.fight();
        queen.fight();
        troll.fight();

        SwordBehavior swordBehavior = new SwordBehavior();
        BowAndArrowBehavior bowAndArrowBehavior = new BowAndArrowBehavior();
        KnightBehavior knightBehavior = new KnightBehavior();
        AreBehavior areBehavior = new AreBehavior();

        swordBehavior.useWeapon();
        bowAndArrowBehavior.useWeapon();
        knightBehavior.useWeapon();
        areBehavior.useWeapon();
    }
}
