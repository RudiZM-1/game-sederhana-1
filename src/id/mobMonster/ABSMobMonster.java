package id.mobMonster;

import id.dropItems.IDropItems;

public abstract class ABSMobMonster {
    private String mobName;
    private int mobLevel;
    private int mobHealth;
    private int mobDropExp;
    private IDropItems[] mobDropItems = new IDropItems[5];

    // setter dan getter mob name
    public void setMobName(String mobName) {
        this.mobName = mobName;
    }
    public String getMobName() {
        return this.mobName;
    }

    // setter dan getter mob level
    public void setMobLevel(int mobLevel) {
        this.mobLevel = mobLevel;
    }
    public int getMobLevel() {
        return this.mobLevel;
    }

    // setter dan getter mob health
    public void setMobHealth(int mobHealth) {
        this.mobHealth = mobHealth;
    }
    public int getMobHealth() {
        return this.mobHealth;
    }

    // setter dan getter mob drop exp
    public void setMobDropExp(int mobDropExp) {
        this.mobDropExp = mobDropExp;
    }
    public int getMobDropExp() {
        return this.mobDropExp;
    }

    // setter dan getter mob drop items
    public void setMobDropItems(IDropItems ... mobDropItems) {
        this.mobDropItems[0] = mobDropItems[0];
        this.mobDropItems[1] = mobDropItems[1];
        this.mobDropItems[2] = mobDropItems[2];
        this.mobDropItems[3] = mobDropItems[3];
        this.mobDropItems[4] = mobDropItems[4];
    }

    public IDropItems getMobDropItems(int index) {
        return this.mobDropItems[index];
    }
    public String getMobDropItemsName(int index) {
        return getMobDropItems(index).getDropName();
    }
    public void showInfoMob() {
        System.out.println("\nName\t\t\t: " + getMobName());
        System.out.println("Level\t\t\t: " + getMobLevel());
        System.out.println("Health\t\t\t: " + getMobHealth());
    }

    public void displayDropItems() {

        if(getMobDropItems(0) != null) {
            System.out.println("\nDrop\t\t\t: " + getMobDropItemsName(0));
        }
        if(getMobDropItems(1) != null) {
            System.out.println("Drop\t\t\t: " + getMobDropItemsName(1));
        }
        if(getMobDropItems(2) != null) {
            System.out.println("Drop\t\t\t: " + getMobDropItemsName(2));
        }
        if(getMobDropItems(3) != null) {
            System.out.println("Drop\t\t\t: " + getMobDropItemsName(3));
        }
        if(getMobDropItems(4) != null) {
            System.out.println("Drop\t\t\t: " + getMobDropItemsName(4));
        }
    }
}
