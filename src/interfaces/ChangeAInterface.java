/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import changea.Drugs;

/**
 *
 * @author Martin
 */
public interface ChangeAInterface {

    /**
     *
     * @return
     */
    String getHighScore();

    /**
     *
     */
    void load();

    /**
     *
     */
    void save();

    //Laver en String af nye Drug priser og Availability til alle Drugs.
    /**
     *
     * @return
     */
    void getRandomDrugStats();

    //tilfojer et antal af kobt drug og fratraekker en sum fra users money
    /**
     *
     */
    void buy(int dBuy, int buyAmount);

    //fratreakker et antal Drug og tilfojer sum til users money
    /**
     *
     */
    void sell(int dSell, int sellAmount);

    //treakker en dag fra users daysLeft og generer nye priser paa drugs. GUI aendre flag alt efter hvilket land
    //man vealger.
    /**
     *
     * @return
     */
    boolean travel();

    /**
     *
     * @return
     */
    String userStock(int choice);

    public void addName(String name);

    public String getName();

    public String[] loadCountries();

    public Drugs[] getNewDrugStats();

    public void makeInventory();

    public Drugs[] getInventory();

}
