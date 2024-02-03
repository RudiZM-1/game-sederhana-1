package id.mobMonster.level1;

import id.dropItems.mobLv1.slimeDrop.SlimeGel;
import id.dropItems.mobLv1.slimeDrop.SlimeCore;
import id.mobMonster.ABSMobMonster;

public class Slime extends ABSMobMonster {

    public void initSlimeDropItems() {
        this.setMobName("Slime");
        this.setMobLevel(1);
        this.setMobHealth(1000);
        this.setMobDropItems(new SlimeGel(), new SlimeCore(), null, null, null);
    }
}
