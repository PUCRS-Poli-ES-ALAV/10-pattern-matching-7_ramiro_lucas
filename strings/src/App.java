public class App {
    public static void main(String[] args) {
        String s1 = "ABCDCBDCBDACBDABDCBADF";
        String s2 = "ADF";

        System.out.println(indexOf(s1, s2)); 
    }

    public static int indexOf(String s1, String s2) {
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();
        int contS1 = 0;
        int contS2 = 0;

        for (int i = 0; i < s1.length()-s2.length(); i++) {
            contS1 = i;
            contS2 = 0;
            while (charS1[contS1] == charS2[contS2]) {
                if (contS2 == s2.length()-1) {
                    return i;
                }
                contS1++;
                contS2++;
            }
        }
        
        
        return -1;
    }
}
