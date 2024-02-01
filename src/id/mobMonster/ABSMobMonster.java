package id.mobMonster;

import java.util.ArrayList;

public abstract class ABSMobMonster {
    private String mobName;
    private byte mobLevel;
    private int mobHealth;
    private int mobDropExp;
    private ArrayList <String> mobDropItems = new ArrayList<String>();

    // setter dan getter mob name
    public void setMobName(String mobName) {
        this.mobName = mobName;
    }
    public String getMobName() {
        return this.mobName;
    }

    // setter dan getter mob level
    public void setMobLevel(byte mobLevel) {
        this.mobLevel = mobLevel;
    }
    public byte getMobLevel() {
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
    public abstract void setMobDropItems(String ... mobDropItems);

    public ArrayList getMobDropItems() {
        return this.mobDropItems;
    }
    public String getMobDropItemList(int index) {
        return this.mobDropItems.get(index);
    }
}
