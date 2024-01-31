package id.player;

public class Player extends ABSPlayer {
    public Player(String username) {
        super(username);
    }

    //
    //
    public String getJobsClassName(){
        return this.getJobClassPlayer().getJobsClassName();
    }
    public int getJobsClassHealth() {
        return this.getJobClassPlayer().getJobsClassHealth();
    }
    public int getJobsClassPhysicalAttackPower() {
        return this.getJobClassPlayer().getJobsClassPhysicalAttackPower();
    }
    public int getJobsClassMagicalAttackPower() {
        return this.getJobClassPlayer().getJobsClassMagicalAttackPower();
    }
    public int getJobsClassPhysicalDefensePower() {
        return this.getJobClassPlayer().getJobsClassPhysicalDefensePower();
    }
    public int getJobsClassMagicalDefensePower() {
        return this.getJobClassPlayer().getJobsClassMagicalDefensePower();
    }

    //
    //
    public void jobClassPlayerName() {
        this.setJobClassPlayerName(getJobsClassName());
    }
    public void healthPlayer() {
        this.setHealthPlayer(getJobsClassHealth());
    }
    public void physicalAttackPowerPlayer() {
        this.setPhysicalAttackPowerPlayer(getJobsClassPhysicalAttackPower());
    }
    public void magicalAttackPowerPlayer() {
        this.setMagicalAttackPowerPlayer(getJobsClassMagicalAttackPower());
    }
    public void physicalDefensePowerPlayer() {
        this.setPhysicalDefensePowerPlayer(getJobsClassPhysicalDefensePower());
    }
    public void magicalDefensePowerPlayer() {
        this.setMagicalDefensePowerPlayer(getJobsClassMagicalDefensePower());
    }
}
