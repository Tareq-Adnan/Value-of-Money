package Classes;


import java.io.FileNotFoundException;
import java.util.Arrays;

public  class Coin extends Money{
    private  int x;
    int count;
    int cam;
    int nc,gc;
    private int normal=0,auto=0;
    Money money=new Money();
    private  String[] y;

    Coin() throws FileNotFoundException {
        super();
        count = money.getCoin().size();
        for (int i = 0; i < count; i++) {
            String n = getCoin().get(i);
            this.y = n.split(" ");
            for(int j=0;j<y.length;j++){
                if(y[j].equals("gold")){
                    int z = Integer.parseInt(this.y[1]);
                    cam+=(20+z);
                    gc=z;
                    auto++;

                }
                else if(y.length<3){
                    int z = Integer.parseInt(this.y[1]);
                    cam=cam+z;
                    normal++;
                    nc=z;
                    break;
                }

            }





        }
    }


    int valueof(){
        if(auto>0){
            System.out.println("A "+gc+" dollar golden coin worth "+(gc+20)+" dollars");
        }
        if(normal>0){
            System.out.println("A "+nc+" dollar normal coin worth "+nc+" dollars");
        }



            return cam;
        }


    }

