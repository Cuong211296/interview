public class _dem_so_ky_tu_cua_mot_chuoi {
public static int countChar(String input, char ch){
    int count = 0;
    for(char c : input.toCharArray()){
        if(c==ch) count++;
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(countChar("cuongcuongcuonnamne", 'c'));
    }
}
