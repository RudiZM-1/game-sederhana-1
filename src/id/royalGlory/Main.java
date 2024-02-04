package id.royalGlory;

import id.mobInit.MobInit;
import id.player.Player;
import id.playerInit.PlayerInit;

public class Main{
    public static void main(String[] args) {
        
        PlayerInit player1 = new PlayerInit(new Player("Rudi ZM"));
        player1.playerInit();

        PlayerInit player2 = new PlayerInit(new Player("Ahmad Zain"));
        player2.playerInit();

        player1.basicAttack(player2);

        MobInit.mobInit();
    }
}