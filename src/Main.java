public class Main {
    public static void main(String[] args) {
        Boss jopa = new Boss();
        jopa.setHp(700);
        jopa.setDmg(100);
        jopa.setName("InronJopa");
        jopa.weapon.setWeaponName("JopaGun");
        jopa.weapon.setWeaponType(WeaponType.ELECTROGUN);
        System.out.println("health:" + jopa.getHp()+ "damage:"+ jopa.getDmg() + jopa.getName() +
                "name of gun :" + jopa.weapon.getWeaponName () +
        "type of weapon: " + jopa.weapon.getWeaponType());
    }
}