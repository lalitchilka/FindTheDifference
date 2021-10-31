public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (Character c : s.toCharArray())
            result ^= c;
        for (Character c : t.toCharArray())
            result ^= c;
        return result;
    }
}
