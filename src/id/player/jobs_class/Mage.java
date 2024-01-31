package id.player.jobs_class;

public class Mage implements IJobsClass {
    private String jobsClassName = "Mage";
    private int jobsClassHealth = 2500;
    private int jobsClassPhysicalAttackPower = 0;
    private int jobsClassMagicalAttackPower = 220;
    private int jobsClassPhysicalDefensePower = 25;
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
