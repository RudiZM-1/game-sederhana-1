package id.ability.attack.basic;

import id.ability.attack.IAttack;
import id.player.Player;

public class BasicAttack implements IAttack {
    private int basicDamage;
    private int attackSpeed;

    public void basicAttack(Player attacker, Player enemy) {
        System.out.println("\n" + attacker.getUsername() + " Attacking " + enemy.getUsername());
        System.out.println(enemy.getHealthPlayer() - 100);
    }

    public void setBasicDamage(int basicDamage) {
        this.basicDamage = basicDamage;
    }
    public int getBasicDamage() {
        return this.basicDamage;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    public int getAttackSpeed() {
        return this.attackSpeed;
    }
}
