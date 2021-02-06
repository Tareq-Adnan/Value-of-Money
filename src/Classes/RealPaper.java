package Classes;

import java.io.FileNotFoundException;

public class RealPaper extends Paper {
    private int count;
    int nm,am;
    private int cam=0;
    private int normal=0,auto=0;
    Paper paper=new Paper();
   private String[] y;
    public RealPaper() throws FileNotFoundException {
        super();
        count=paper.getReal().size();
        for(int i=0;i<count;i++){
            String n=getReal().get(i);
            y=n.split(" ");

            for(int j=0;j<y.length;j++){
                if(y[j].equals("autographed")){
                    int z=Integer.parseInt(y[1]);
                    cam+=(z+10);
                    am=z;
                    auto++;
                }
                else if(y.length<4) {
                    int z=Integer.parseInt(y[1]);
                    cam+=z;
                    nm=z;
                    normal++;
                    break;
                }
            }
        }


    }

    int valueof(){
        if(auto>0){
            System.out.println("An authentic autographed "+am+" dollar bill worth "+(am+10)+" dollars.");
        }
        if(normal>0){
            System.out.println("An authentic "+nm+" dollar bill worth "+nm+" dollars.");
        }
        return cam;
    }


}
