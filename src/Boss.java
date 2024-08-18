public class Boss extends GameEntity{
    private Weapon bossWeapon;

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public void printInfo(){
        System.out.println("Boss health: " + this.health);
        System.out.println("Boss damage: " + this.damage);
        System.out.println("Boss weapon: " + this.bossWeapon.getWeaponName());
    }
}
