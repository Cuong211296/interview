public class _so_lon_thu_2_trong_chuoi_so_nguyen {
    public static int chuoiso(int[] number){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int c: number){
            if(c > first){
                second = first;
                first = c;
            } else if (c > second && c != first) {
                second =c;
            }
        }
        return second;

    }

    public static void main(String[] args) {
        int[] so= {1,2,3,4,5,5,6,6};
        System.out.println(chuoiso(so));
    }
}
