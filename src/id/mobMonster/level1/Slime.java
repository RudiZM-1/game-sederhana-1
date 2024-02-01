package id.mobMonster.level1;

import id.mobMonster.ABSMobMonster;

public class Slime extends ABSMobMonster {

    public void setMobDropItems(String ... mobDropItems) {
        this.getMobDropItems().add("Lendir");
        this.getMobDropItems().add("Kristal");
    }
}
