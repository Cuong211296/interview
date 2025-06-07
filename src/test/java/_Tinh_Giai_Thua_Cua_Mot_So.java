public class _Tinh_Giai_Thua_Cua_Mot_So {
    public static int tinhGiaiThua(int k){
        int result=1;
        if(k==0||k==1){result=1;}
        else {
            for(int i =2; i<=k;i++){
                result *= i;

            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(tinhGiaiThua(6));
    }
}
