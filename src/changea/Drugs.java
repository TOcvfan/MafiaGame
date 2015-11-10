package changea;

public class Drugs {

    int drugBasePrice;
    int availBase;
    String drugName;
    int drugChance;

    public Drugs(int drugBasePrice, int availBase, String drugName, int drugChance) {
        this.drugBasePrice = drugBasePrice;
        this.availBase = availBase;
        this.drugName = drugName;
	this.drugChance = drugChance;
    }

    public Drugs(String drugName, int availBase) {
	this.availBase = availBase;
	this.drugName = drugName;
    }

    public int getDrugBasePrice() {
	return drugBasePrice;
    }

    public void setDrugBasePrice(int drugBasePrice) {
	this.drugBasePrice = drugBasePrice;
    }

    public int getAvailBase() {
	return availBase;
    }

    public void setAvailBase(int availBase) {
	this.availBase = availBase;
    }

    public String getDrugName() {
	return drugName;
    }

    public void setDrugName(String drugName) {
	this.drugName = drugName;
    }

    public Drugs(String drugName) {
	this.drugName = drugName;
    }

    public Drugs() {
    }


    @Override
    public String toString() {
	return drugName;
    }
    
}
