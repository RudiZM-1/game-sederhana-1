package id.player.jobsClass;

public class Assasins implements IJobsClass{
    private String jobsClassName = "Assasins";
    private int jobsClassHealth = 2500;
    private int jobsClassPhysicalAttackPower = 250;
    private int jobsClassMagicalAttackPower = 0;
    private int jobsClassPhysicalDefensePower = 10;
    private int jobsClassMagicalDefensePower = 25;

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
