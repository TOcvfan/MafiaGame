package changea;

import entity.FileHandler;
import entity.User;
import interfaces.ChangeAInterface;
import java.awt.Component;
import javax.swing.JOptionPane;

/*
 *
 * @author Martin
 */
public class Control implements ChangeAInterface {

    String[] countryArray;
    Country con;
    User user;
    RandomCal ran;
    FileHandler fh;
    Drugs[] bP;
    Drugs[] rP;
    Drugs[] in;
    Drugs drug;
    String drugInfo;
    Inventory inven;

    public Control() {
	user = new User();
	inven = new Inventory();
	ran = new RandomCal();
	fh = new FileHandler();
	bP = ran.drugList();
	rP = new Drugs[10];
	in = inven.inventory();
	con = new Country();
    }

    @Override
    public void load() {
	fh.readFile();
    }

    @Override
    public void save() {
	fh.saveFile();

    }

    public void getRandomDrugStats() {

	drugInfo = "";

	for (int i = 0; i < 10; i++) {
	    rP[i] = new Drugs(ran.basePricing(bP[i]), ran.baseAvail(bP[i]), bP[i].drugName, bP[i].drugChance);
	}
	for (int i = 0; i < 10; i++) {
	    drugInfo += rP[i].drugName + " Availabilty: " + rP[i].availBase + " Price: " + rP[i].drugBasePrice + "$\n";
	}

    }

    @Override
    public void buy(int dBuy, int buyAmount) {

	System.out.println("Buy AMoundt " + buyAmount);
	int selectedDrugPrice = rP[dBuy].getDrugBasePrice();
	int userMoney = user.getMoney();
	int userDrugAmount = in[dBuy].availBase;
	int storeDrugAmount = rP[dBuy].availBase;
	System.out.println("BUY_Old User Money: " + userMoney + " - " + "Old Stock: " + userDrugAmount);

	int buyingPrice = (selectedDrugPrice * buyAmount);
	int newUserDrugAmount = userDrugAmount + buyAmount;
	int newStoreDrugAmount = storeDrugAmount - buyAmount;

	if (userMoney < buyingPrice) {
	    JOptionPane.showMessageDialog(null, "Hey man, you dont have enough money!!");
	}
	if (newStoreDrugAmount < buyAmount) {
	    JOptionPane.showMessageDialog(null, "We dont have enough of that Drug in stock. Pick something else!!");
	}
	if (buyingPrice < userMoney || storeDrugAmount < buyAmount) {
	    int newMoney = userMoney - buyingPrice;

	    user.setMoney(newMoney);
	    rP[dBuy].setAvailBase(newStoreDrugAmount);
	    in[dBuy].setAvailBase(newUserDrugAmount);
	    System.out.println("BUY_New User Money: " + user.getMoney() + " - " + "New Stock: " + in[dBuy].availBase + " " + newStoreDrugAmount);
	}

    }

    @Override
    public void sell(int dSell, int sellAmount) {

	System.out.println("Sell AMoundt " + sellAmount);
	int storeDrugAmount = rP[dSell].availBase;
	int selectedDrugPrice = rP[dSell].getDrugBasePrice();
	int userMoney = user.getMoney();
	int userDrugAmount = in[dSell].availBase;
	System.out.println("Old User Amount: " + userDrugAmount + " " + "Old UserMoney: " + userMoney);

	int newMoney = userMoney + (selectedDrugPrice * sellAmount);
	int newUserDrugAmount = userDrugAmount - sellAmount;
	int newStoreDrugAmount = storeDrugAmount + sellAmount;

	if (userDrugAmount < sellAmount) {
	    JOptionPane.showMessageDialog(null, "You dont gats' enough Drugs, pal!");
	} else {
	    user.setMoney(newMoney);
	    in[dSell].setAvailBase(newUserDrugAmount);
	    rP[dSell].setAvailBase(newStoreDrugAmount);
	    System.out.println("New User Amount: " + in[dSell].availBase + " " + "New UserMoney: " + user.getMoney());
	}
    }

    @Override
    public boolean travel() {

	int daysLeft = user.getDaysleft();
//System.out.println(user.getDaysleft());
	if (daysLeft >= 1) {
	    user.setDaysleft(daysLeft - 1);
	    return false;

	} else {

// System.out.println("end");
	    return true;

	}

    }

    @Override
    public String getHighScore() {
	return fh.getCurrentscores();
    }

    @Override
    public String userStock(int choice) {
	
	if(choice == 1){
	String money = "Money: " + user.getMoney() + "$";
	return money;
	}else{

	String userStat;

	userStat = "Money: " + user.getMoney() + " $" + " Days left: " + user.getDaysleft();

	return userStat;
	}
    }

    @Override
    public void addName(String name) {
	user.setName(name);
	fh.add(user);

    }

    @Override
    public String getName() {

	return user.getName();

    }

    @Override
    public String[] loadCountries() {
	countryArray = con.countryList();

	return countryArray;

    }

    @Override
    public Drugs[] getNewDrugStats() {
	return rP;
    }

    @Override
    public void makeInventory() {
	inven.inventory();
    }

    @Override
    public Drugs[] getInventory() {
	return in;
    }

}
