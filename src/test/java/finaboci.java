import java.util.Scanner;

public class finaboci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hien thi bao nhieu so fibonaci: ");
        int ab= input.nextInt();
        System.out.println("day "+ab +" do fibonaci: ");
        for(int j=0;j < ab; j++){
            //System.out.print(finaboci(j)+ " ");
            System.out.print(finaboci2(j)+ " ");
        }


    }

    public static int finaboci(int k){
        int f0 = 0, f1=1,fn=1;
        if(k<0){return -1;}
        else if(k==0 || k==1){return k;}
        else {
            for(int i=2; i<=k;i++){
                fn=f0+f1;
                f0=f1;
                f1=fn;
            }
        }
        return fn;
    }

    public static int finaboci2(int k){
        if(k<0) {return -1;}
        else if(k==0 || k==1){return k;}
        else {return finaboci2(k-1)+finaboci2(k-2);}
    }
}
