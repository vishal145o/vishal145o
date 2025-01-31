import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
Scanner sec= new Scanner(System.in);
        String word1 = sec.next();
        String word2 = sec.next();
        String mergedString = mergeStrings(word1, word2);
        System.out.println("Merged String: " + mergedString);
 }

    public static String mergeStrings(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j));
                j++;
            }
        }

         return merged.toString();
    }
}
