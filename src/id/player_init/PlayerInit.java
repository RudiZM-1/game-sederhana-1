package id.player_init;

import id.player.Player;
import id.player.equipments.equipments_category.armors.Selvlet;
import id.player.equipments.equipments_category.weapons.Katana;
import id.player.jobs_class.*;

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
