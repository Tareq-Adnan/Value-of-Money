package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Money {
   private ArrayList<String> Paper;
   private ArrayList<String> coin;
    private Scanner sc;

    Money() throws FileNotFoundException {
        File f = new File("data.txt");
        sc = new Scanner(f);
        String[] l;
        Paper=new ArrayList<>();
        coin=new ArrayList<>();

            while (sc.hasNextLine()){
                String temp= sc.nextLine();
                l=temp.split(" ");
                if(l[0].equals("Coin")){
                    coin.add(temp);
                }
                else{
                    Paper.add(temp);
                }


        }

    }

    public ArrayList<String> getCoin() {
        return coin;
    }

    public ArrayList<String> getPaper() {
        return Paper;
    }
}




