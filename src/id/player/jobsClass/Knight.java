package id.player.jobsClass;

public class Knight implements IJobsClass {
    
    private String jobsClassName = "Knight";
    private int jobsClassHealth = 3000;
    private int jobsClassPhysicalAttackPower = 200;
    private int jobsClassMagicalAttackPower = 0;
    private int jobsClassPhysicalDefensePower = 50;
    private int jobsClassMagicalDefensePower = 50;

    public String getJobsClassName() {
        return this.jobsClassName;
    }
    public int getJobsClassHealth() {
        return this.jobsClassHealth;
    }
    public int getJobsClassPhysicalAttackPower() {
        return this.jobsClassPhysicalAttackPower;
    }
    public int getJobsClassMagicalAttackPower() {
        return this.jobsClassMagicalAttackPower;
    }
    public int getJobsClassPhysicalDefensePower() {
        return this.jobsClassPhysicalDefensePower;
    }
    public int getJobsClassMagicalDefensePower() {
        return this.jobsClassMagicalDefensePower;
    }  
}
