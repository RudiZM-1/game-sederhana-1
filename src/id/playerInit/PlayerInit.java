package id.playerInit;

import id.player.Player;
import id.player.equipments.equipmentsCategory.armors.Selvlet;
import id.player.equipments.equipmentsCategory.weapons.Katana;
import id.player.jobsClass.*;

public class PlayerInit {
    public static void playerInit() {
        
        Player player = new Player("Rudi ZM");

        player.setJobClassPlayer(new Assasins());
        
        player.equipWeapon(new Katana());
        player.equipArmor(new Selvlet());

        player.physicalAttackPowerPlayer();
        player.physicalDefensePowerPlayer();
        player.infoPlayer(); 
    }
    
}
