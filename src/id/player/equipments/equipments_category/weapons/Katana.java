package id.player.equipments.equipments_category.weapons;

public class Katana implements IWeapons {
    private String equipmentsCategory = "Weapon";
    private String weaponsName = "Katana";
    private int equipmentsPhysicalAttackPower = 250;

    public String getEquipmentsCategory() {
        return this.equipmentsCategory;
    }
    public String getWeaponsName() {
        return this.weaponsName;
    }
    public int getWeaponsPhysicalAttackPower() {
        return this.equipmentsPhysicalAttackPower;
    }
}
