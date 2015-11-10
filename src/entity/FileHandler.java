package entity;

import changea.Country;
import changea.Drugs;
import changea.RandomCal;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author TOcvfan
 */
public class FileHandler {

    private static Random ran = new Random();
    Country country;
    User user;
    String currentscores;
    private Scanner f;
    public static ArrayList<User> list = new ArrayList<User>();

//-----------------------------------------------------------------------
    public void add(User user) {
	list.add(user);
	
    }

//Reads from file
    public void readFile() {

	try {
	    f = new Scanner(new File("highscores.txt"));
	} catch (Exception e) {
	    System.out.println("Could not locate file");
	}

	while (f.hasNext()) {

	    String name = f.next();
	    int money = Integer.parseInt(f.next());
	    
	    User user = new User(name, money);
	    list.add(user);
	    
	    //System.out.println("readfile: " + name + " " + money + "\n");
	    currentscores +=  name + " " + money + "\n";
	    currentscores.trim();
	    System.out.println(currentscores.trim());
	}
    }

    public String getCurrentscores() {
	return currentscores;
    }
    

//saves file
    public void saveFile() {

	PrintWriter pw = null;
	String score = "";

	try {
	    pw = new PrintWriter(new File("highscores.txt"));

	} catch (Exception e) {
	    System.out.println("Could not save file!");
	}

	for (int i = 0; i < list.size(); i++) {

	    score = list.get(i).getName() + " " + list.get(i).getMoney();


	    pw.println(score);
	    //System.out.println(score);
	}
	//pw.println(user.getName() + " " + user.getMoney());
	pw.close();
    }
   
    
}
