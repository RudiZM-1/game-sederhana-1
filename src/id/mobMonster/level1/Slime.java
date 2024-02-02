package id.mobMonster.level1;

import id.mobMonster.ABSMobMonster;

public class Slime extends ABSMobMonster {

    public void setMobDropItems() {
        this.getMobDropItems().add("Lendir");
        this.getMobDropItems().add("Kristal");
    }
}
