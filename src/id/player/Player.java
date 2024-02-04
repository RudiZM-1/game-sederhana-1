package id.player;

public class Player extends ABSPlayer {
    public Player(String username) {
        super(username);
    }

    public int calcPlayerPhysicalAttackPower() {
        if(this.getWeapons() != null) {
            return this.getPhyscalAttackPowerPlayer() + this.getJobClassPlayer().getJobsClassPhysicalAttackPower() + this.getWeaponsPhysicalAttackPower();
        } else {
            return this.getPhyscalAttackPowerPlayer() + this.getJobClassPlayer().getJobsClassPhysicalAttackPower();
        }
    }
    public int calcPlayerPhysicalDefensePower() {
        if(this.getArmors() != null) {
            return this.getPhysicalDefensePowerPlayer() + this.getJobClassPlayer().getJobsClassPhysicalDefensePower() + this.getArmorsPhysicalDefensePower();
        } else {
            return this.getPhysicalDefensePowerPlayer() + this.getJobClassPlayer().getJobsClassPhysicalDefensePower();
        }
    }

    public void healthPlayer() {
        this.setHealthPlayer(1000);
    }
    public void physicalAttackPowerPlayer() {
        this.setPhysicalAttackPowerPlayer(calcPlayerPhysicalAttackPower());
    }
    public void magicalAttackPowerPlayer() {
        this.setMagicalAttackPowerPlayer(0);
    }
    public void physicalDefensePowerPlayer() {
        this.setPhysicalDefensePowerPlayer(calcPlayerPhysicalDefensePower());
    }
    public void magicalDefensePowerPlayer() {
        this.setMagicalDefensePowerPlayer(0);
    }
}
