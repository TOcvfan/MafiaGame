package changea;

import java.util.Random;

public class RandomCal {

    Random ran = new Random();
    private int drugPrice;
    private int drugAvail;
    private int counter = 0;

    public int basePricing(Drugs selectedDrug) {

	int drugBasePrice = selectedDrug.drugBasePrice;
	int drugChance = selectedDrug.drugChance;

	int standartRoll = ran.nextInt(86);
	int chanceRoll = ran.nextInt(101);

	int priceChange = (drugBasePrice * standartRoll) / 100;

	if (ran.nextInt(2) == 0) {
	    drugPrice = drugBasePrice - priceChange;
	} else {
	    drugPrice = drugBasePrice + priceChange;
	}
//Chance extension!
	if (drugChance >= chanceRoll) {
	    drugPrice = drugPrice * 10;
	}

	return drugPrice;
    }

    public int baseAvail(Drugs selectedDrug) {

	int drugAvailBase = selectedDrug.availBase;

	int value03 = ran.nextInt(2);
	int value04 = ran.nextInt(41) + 15;

	int availChange = (drugAvailBase * value04) / 100;

	if (value03 == 0) {
	    drugAvail = drugAvailBase - availChange;
	}
	if (value03 == 1) {
	    drugAvail = drugAvailBase + availChange;
	}
	return drugAvail;

    }

    public Drugs[] drugList() {

	Drugs[] drugArray = new Drugs[10];

	Drugs cocaine = new Drugs(1200, 30, "Cocaine", 10);
	drugArray[0] = cocaine;
	Drugs heroine = new Drugs(1600, 15, "Heroine", 15);
	drugArray[1] = heroine;
	Drugs amphetamine = new Drugs(200, 50, "Amphetamine", 7);
	drugArray[2] = amphetamine;
	Drugs acid = new Drugs(550, 33, "Acid", 5);
	drugArray[3] = acid;
	Drugs angelDust = new Drugs(400, 60, "Angel Dust", 7);
	drugArray[4] = angelDust;
	Drugs meth = new Drugs(800, 38, "Crystal Meth", 12);
	drugArray[5] = meth;
	Drugs hash = new Drugs(180, 200, "Hash", 4);
	drugArray[6] = hash;
	Drugs weed = new Drugs(150, 115, "Weed", 5);
	drugArray[7] = weed;
	Drugs mushrooms = new Drugs(120, 95, "Mushrooms", 7);
	drugArray[8] = mushrooms;
	Drugs valium = new Drugs(290, 80, "Valium", 7);
	drugArray[9] = valium;

	return drugArray;

    }
}
