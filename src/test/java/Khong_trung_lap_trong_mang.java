import java.util.HashSet;
import java.util.Set;

public class Khong_trung_lap_trong_mang {
    public static void mang(int[] arr) {
        Set<Integer> duyNhat = new HashSet<>();
        for (int num : arr) duyNhat.add(num);
        for (int num : duyNhat) System.out.println(num);
    }
    public static void main(String[] args) {
        int[] so = {1,3,3,5,6,2,5,6,7,8};
        mang(so);
    }
}
