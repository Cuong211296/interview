public class _58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split(" ");

        return s1.length == 0? 0: s1[s1.length -1].length();
    }
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
