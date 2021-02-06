package Classes;

import java.io.FileNotFoundException;

public class FakePaper extends Paper {
    int xz;
    int xyz;
    int nf,af;
    public FakePaper() throws FileNotFoundException {
        super();
        Paper p=new Paper();
        int count=getFake().size();
        for(int j=0;j<count;j++){
            String n=p.getFake().get(j);
            String[] y=n.split(" ");

            for(int i=0;i<y.length;i++){
                if(y[i].equals("autographed")){
                    xz++;
                    af=Integer.parseInt(y[1]);

                }
                if(y.length<4){
                    nf=Integer.parseInt(y[1]);
                    xyz++;
                }
            }
        }



    }


    int valuof(){
        if(xz>0){
            System.out.println("An counterfeit autographed "+af+" dollar bill worth 0 dollars");
        }
        if(xyz>0){
            System.out.println("An counterfeit "+nf+" dollar bill worth 0 dollars");
        }

        return x*0;
    }
}
