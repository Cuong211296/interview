import org.example.Main;

import java.util.Scanner;

public class _Tinh_So_Nguyen_To {
    public static boolean checkSoNguyenTo(int k){
        if(k<2){return false;}
        else {
            int locSo = (int)Math.sqrt(k);
            for(int i =2; i<=locSo;i++){
                if(k%i==0){return false;}
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("nhap so de kiem tra: ");
        int temp= input.nextInt();
        for(int j= 0; j<=temp;j++){
            if(checkSoNguyenTo(j)){
        System.out.print(j + " ");}}
    }
}
