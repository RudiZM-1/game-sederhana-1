package id.player_init;

import id.player.Player;
import id.player.jobs_class.*;

public class PlayerInit {
    public static void playerInit() {
        
        Player player = new Player("Rudi ZM");

        player.setJobClassPlayer(new Mage());
        player.jobClassPlayerName();
        player.healthPlayer();
        player.physicalAttackPowerPlayer();
        player.physicalDefensePowerPlayer();
        player.magicalAttackPowerPlayer();
        player.magicalDefensePowerPlayer();
        player.infoPlayer(); 
    }
    
}
