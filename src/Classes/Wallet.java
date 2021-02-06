package Classes;

import java.io.FileNotFoundException;

public class Wallet {
    Coin coin=new Coin();
    RealPaper paper=new RealPaper();
    FakePaper paper1=new FakePaper();
    Integer Total;

   public Wallet() throws FileNotFoundException {

        Total=paper.valueof()+coin.valueof()+paper1.valuof();
    }


}
