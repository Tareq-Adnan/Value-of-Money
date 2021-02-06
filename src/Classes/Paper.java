package Classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Paper extends Money {
    private ArrayList<String> real,fake;
     String[] sp1,sp2;
    int x;

    public Paper() throws FileNotFoundException {
        super();
        real=new ArrayList<>();
        fake=new ArrayList<>();

        Money money=new Money();
        x=money.getPaper().size();
        for(int i=0;i<x;i++){

            sp1=money.getPaper().get(i).split(" ");

            for(int j=0;j<sp1.length;j++){
                if(sp1[j].equals("authentic")){
                    real.add(money.getPaper().get(i));
                }
                if(sp1[j].equals("counterfeit") ){
                    fake.add(money.getPaper().get(i));
                }
            }

        }
    }

    public ArrayList<String> getFake() {
        return fake;
    }

    public ArrayList<String> getReal() {
        return real;
    }
}
