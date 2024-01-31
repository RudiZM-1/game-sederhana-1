package id.player;

import id.player.equipments.equipments_category.armors.IArmors;
import id.player.equipments.equipments_category.weapons.IWeapons;
import id.player.jobs_class.*;

public abstract class ABSPlayer {

    private String username = null;
    private IJobsClass jobsClassPlayer;
    private int healthPlayer = 0;
    private int physicalAttackPowerPlayer = 0;
    private int magicalAttackPowerPlayer = 0;
    private int physicalDefensePowerPlayer = 0;
    private int magicalDefensePowerPlayer = 0;
    private IWeapons weapons = null;
    private IArmors armors = null;

    // constructor
    public ABSPlayer(String username) {
        this.username = username;
    }

    //
    // getter username player
    public String getUsername() {
        return this.username;
    }
    // setter username player
    public void setUsername(String username) {
        this.username = username;
    }

    //
    // setter class player
    public void setJobClassPlayer(IJobsClass jobsClassPlayer) {
        this.jobsClassPlayer = jobsClassPlayer;
    }
    // getter class player
    public IJobsClass getJobClassPlayer() {
        return this.jobsClassPlayer;
    }
    
    //
    // getter job class player name
    public String getJobClassPlayerName() {
        return this.jobsClassPlayer.getJobsClassName();
    }

    //
    // getter health player
    public int getHealthPlayer() {
        return this.healthPlayer;
    }
    // setter health player
    public void setHealthPlayer(int healthPlayer) {
        this.healthPlayer = healthPlayer;
    }

    //
    // getter physical atttack power player
    public int getPhyscalAttackPowerPlayer() {
        return this.physicalAttackPowerPlayer;
    }
    // setter physical attack power player
    public void setPhysicalAttackPowerPlayer(int physicalAttackPowerPlayer) {
        this.physicalAttackPowerPlayer = physicalAttackPowerPlayer;
    }

    //
    // getter magical attack power player
    public int getMagicalAttackPowerPlayer() {
        return this.magicalAttackPowerPlayer;
    }
    // setter magical attack power player
    public void setMagicalAttackPowerPlayer(int magicalAttackPowerPlayer) {
        this.magicalAttackPowerPlayer =  magicalAttackPowerPlayer;
    }

    //
    // getter physical defense power player
    public int getPhysicalDefensePowerPlayer() {
        return this.physicalDefensePowerPlayer;
    }
    // setter physical defense power player
    public void setPhysicalDefensePowerPlayer(int physicalDefensePowerPlayer) {
        this.physicalDefensePowerPlayer = physicalDefensePowerPlayer;
    }

    //
    // getter magical defense power player
    public int getMagicalDefensePowerPlayer() {
        return this.magicalDefensePowerPlayer;
    }
    // setter magical defense power player
    public void setMagicalDefensePowerPlayer(int magicalDefensePowerPlayer) {
        this.magicalDefensePowerPlayer = magicalDefensePowerPlayer;
    }
    







    //
    // setter weapons
    public void equipWeapon(IWeapons weapons) {
        this.weapons = weapons;
    }
    // getter weapons
    public IWeapons getWeapons() {
        return this.weapons;
    }
    // getter weapons name
    public String getWeaponsName() {
        if(this.weapons != null) {
            return this.weapons.getWeaponsName();
        } else {
            return "Dont Have Weapons";
        }
    }
    // getter weapons physical attack power
    public int getWeaponsPhysicalAttackPower() {
        if(this.weapons != null) {
            return this.weapons.getWeaponsPhysicalAttackPower();
        } else {
            return 0;
        }
    }



    public void equipArmor(IArmors armors) {
        this.armors = armors;
    }
    public IArmors getArmors() {
        return this.armors;
    }

     public String getArmorsName() {
        if(this.weapons != null) {
            return this.armors.getArmorsName();
        } else {
            return "Dont Have Armors";
        }
    }

    public int getArmorsPhysicalDefensePower() {
        if(this.weapons != null) {
            return this.armors.getArmorsPhysicalDefensePower();
        } else {
            return 0;
        }
    }




    //
    // display info player
    public void infoPlayer() {
        System.out.println("Name\t\t\t: " + this.username);
        System.out.println("Class\t\t\t: " + this.getJobClassPlayerName());
        System.out.println("Health\t\t\t: " + this.healthPlayer);

        if(this.weapons != null) {
            System.out.println("Physical Attack\t\t: " + this.physicalAttackPowerPlayer + " (+" + getWeaponsPhysicalAttackPower() +")");
        } else {
            System.out.println("Physical Attack\t\t: " + this.physicalAttackPowerPlayer);
            
        }

        System.out.println("Magical Attack\t\t: " + this.magicalAttackPowerPlayer);

        if(this.armors != null) {
            System.out.println("Physical Defense\t: " + this.physicalDefensePowerPlayer + " (+" + getArmorsPhysicalDefensePower() +")");
        } else {
            System.out.println("Physical Defense\t: " + this.physicalDefensePowerPlayer);
            
        }

        System.out.println("Magical Defense\t\t: " + this.magicalDefensePowerPlayer);

        System.out.println("\nWeapon\t\t\t: " + this.getWeaponsName());
        System.out.println("Physical Attack\t\t: +" + this.getWeaponsPhysicalAttackPower());
        
        System.out.println("\nArmor\t\t\t: " + this.getArmorsName());
        System.out.println("Physical Defense\t: +" + this.getArmorsPhysicalDefensePower());
        

    }
}
