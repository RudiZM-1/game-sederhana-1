package id.royalGlory;

import id.mobMonster.level1.Slime;
import id.playerInit.PlayerInit;

public class Main{
    public static void main(String[] args) {
        PlayerInit.playerInit();
        Slime slime  = new Slime();

        slime.setMobDropItems();
        System.out.println(slime.getMobDropItemList(0));
        System.out.println(slime.getMobDropItemList(1));

    }
}