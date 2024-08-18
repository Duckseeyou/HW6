public class Main {
    public static void main(String[] args) {
        Weapon zombieWeapon = new Weapon();
        zombieWeapon.setWeaponType(WeaponType.MELEE);
        zombieWeapon.setWeaponName("Bite");

        Boss zombie = new Boss();
        zombie.setBossWeapon(zombieWeapon);
        zombie.setHealth(200);
        zombie.setDamage(30);

        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setWeaponType(WeaponType.RANGED);
        skeletonWeapon.setWeaponName("Bones");

        Skeleton sans = new Skeleton();
        sans.setHealth(1);
        sans.setDamage(1);
        sans.setBossWeapon(skeletonWeapon);
        sans.setArrowsAmount(200);

        Skeleton papyrus = new Skeleton();
        papyrus.setHealth(680);
        papyrus.setDamage(20);
        papyrus.setBossWeapon(skeletonWeapon);
        papyrus.setArrowsAmount(200);

        sans.printInfo();
        papyrus.printInfo();
    }
}