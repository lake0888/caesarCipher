import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scanner.nextLine();
        System.out.println("Enter steps");
        int k = scanner.nextInt();
        System.out.println(caesarCipher(s, k));
        scanner.close();
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        if (k > 26) k %= 26;
        String str = "";
        String pattern = "[a-zA-Z]+";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String cStr = String.valueOf(c);

            if (cStr.matches(pattern)) {
                int cI = ((int) c) + k;
                if (Character.isUpperCase(c)) {
                    if (cI > 90) {
                        cI = 65 + cI - 90 - 1;                        
                    }
                } else {
                    if (cI > 122) {
                        cI = 97 + cI - 122 - 1;
                    }
                }
                str += (char) cI;
            } else {
                str += c;
            }
        }
        return str;
    }
}