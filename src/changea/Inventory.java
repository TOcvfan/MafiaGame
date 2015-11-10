/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changea;

/**
 *
 * @author TOcvfan
 */
public class Inventory {

    Drugs cocaine;
    Drugs heroine;
    Drugs amphetamine;
    Drugs acid;
    Drugs angelDust;
    Drugs meth;
    Drugs hash;
    Drugs weed;
    Drugs mushrooms;
    Drugs valium;

    public Drugs[] inventory() {
	Drugs[] inventory = new Drugs[10];

	cocaine = new Drugs("Cocaine" ,0);
	inventory[0] = cocaine;
	heroine = new Drugs("Heroine" ,0);
	inventory[1] = heroine;
	amphetamine = new Drugs("Amphetamine" ,0);
	inventory[2] = amphetamine;
	acid = new Drugs("Acid" ,0);
	inventory[3] = acid;
	angelDust = new Drugs("Angel Dust" ,0);
	inventory[4] = angelDust;
	meth = new Drugs("Crystal Meth" ,0);
	inventory[5] = meth;
	hash = new Drugs("Hash" ,0);
	inventory[6] = hash;
	weed = new Drugs("Weed" ,0);
	inventory[7] = weed;
	mushrooms = new Drugs("Mushrooms" ,0);
	inventory[8] = mushrooms;
	valium = new Drugs("Valium" ,0);
	inventory[9] = valium;
	
	return inventory;

    }
}
