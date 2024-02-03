package id.mobInit;

import id.mobMonster.level1.Slime;

public class MobInit {
    public static void mobInit() {
        Slime slime = new Slime();
        slime.initSlimeDropItems();

        slime.showInfoMob();
        if(slime.getMobHealth() == 0) {
            slime.displayDropItems();
        }
    }
    
}
