package greedy;

public class Lexicographically {
    public static void build() {
        int k = 42;
        int n = 5;

        char character[] = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        int cmp = k;
        String str = "";

        for (int i = 25; i >= 0; i--) {
            while (cmp >= (character[i] - 'a' + 1) && str.length() < n) {
                str = character[i] + str;
                cmp -= (character[i] - 'a' + 1);
            }
        }

        while (str.length() < n) {
            str = 'a' + str;
        }

        System.out.println(str);
    }

    
}
