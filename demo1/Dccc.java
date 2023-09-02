package demo1;

public class Dccc {
    public static void main(String[] args) {

//        给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
//
//        如果可以，返回 true ；否则返回 false 。
//
//        magazine 中的每个字符只能在 ransomNote 中使用一次。
        boolean b = canConstruct("a", "ab");
        System.out.println(b);

    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean contains = magazine.contains(ransomNote);
        return contains;
    }
}
