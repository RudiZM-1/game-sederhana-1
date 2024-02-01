package id.player.jobsClass;

public class Novice implements IJobsClass {
    private String jobsClassName = "Novice";
    private int jobsClassHealth = 1000;
    private int jobsClassPhysicalAttackPower = 50;
    private int jobsClassMagicalAttackPower = 50;
    private int jobsClassPhysicalDefensePower = 0;
    private int jobsClassMagicalDefensePower = 0;

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
