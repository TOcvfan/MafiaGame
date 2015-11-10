package changea;

import java.sql.Array;

public class Country {

    
//    int drugPrice;
//    int avail;
    String countryName;

    public Country(String countryName) {

        this.countryName = countryName;
    }

    public Country() {
    }

    
    
    public String[] countryList() {
	
	String[] countryArray = new String[6];
        countryArray[0] = "Columbia";
	countryArray[1] = "Denmark";
        countryArray[2] = "Germany";
        countryArray[3] = "USA";
        countryArray[4] = "France";
        countryArray[5] = "Afghanistan";

        return countryArray;

    }

   
}
