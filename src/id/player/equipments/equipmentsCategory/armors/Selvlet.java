package id.player.equipments.equipmentsCategory.armors;

public class Selvlet implements IArmors {
    private String equipmentsCategory = "Armors";
    private String armorsName = "Selvlet";
    private int armorsPhysicalDefensePower = 100;

    public String getEquipmentsCategory() { 
        return this.equipmentsCategory;
    }
    public String getArmorsName() {
        return this.armorsName;
    }
    public int getArmorsPhysicalDefensePower() {
        return this.armorsPhysicalDefensePower;
    }
}
