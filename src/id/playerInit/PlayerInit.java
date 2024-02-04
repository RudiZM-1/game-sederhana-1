package id.playerInit;

import id.player.Player;
import id.player.equipments.equipmentsCategory.armors.Selvlet;
import id.player.equipments.equipmentsCategory.weapons.Katana;
import id.player.jobsClass.*;

public class PlayerInit {

    public Player player;

    public PlayerInit(Player player) {
        this.player = player;
    }
    private Player getPlayer() {
        return this.player;
    }
    public void playerInit() {

        this.player.setJobClassPlayer(new Assasins());
        
        this.player.equipWeapon(new Katana());
        this.player.equipArmor(new Selvlet());

        this.player.healthPlayer();
        this.player.physicalAttackPowerPlayer();
        this.player.physicalDefensePowerPlayer();
        this.player.infoPlayer(); 

    }

    public void basicAttack(PlayerInit enemy) {
        this.player.basicAttack(this.getPlayer(), enemy.getPlayer());
    }
    
}
