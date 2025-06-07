public class _kiem_tra_So_Nguyen_To {
    /**
     //so phai lon hon 1
     //so chi chia het cho chinh no -> int i =2; i <= number -1;i++ hoặc int i =2; i <= Math.sqrt(number);i++
     */
public static boolean soNguyenTo(int number){
    if(number <= 1) return false;
    for(int i =2; i <= number -1;i++){
        if(number % i ==0) return false;
    }
    return true;
}
    public static void main(String[] args) {
        System.out.println("So Nguyen To = "+ soNguyenTo(15));
    }
}
