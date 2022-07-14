package Day03.WordFormClass;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public abstract void fight();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
