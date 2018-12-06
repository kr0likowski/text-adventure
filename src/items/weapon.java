package items;

public class weapon extends item {
    private int dmg;

    public weapon(String name, String desc, int value,int dmg) {
        super(name, desc, value);
        this.dmg=dmg;
    }

    @Override
    public void itemInfo() {
        super.itemInfo();
        System.out.println("Deals " +dmg+ " damage");
    }
}
