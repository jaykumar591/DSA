import java.util.*;
import store.*;
class Query {
    LinkedHashMap<String, String> map = new LinkedHashMap<>();
    
    public void grab() {
        map.putAll(new Marketing().data());
        map.putAll(new Veg().data());
        map.putAll(new Tech().data());
        map.putAll(new Political().data());

    }

    public static int findSimilarityPercentage(String text1, String text2) {
        if (text1.equalsIgnoreCase(text2))
            return 100;

        String[] words1 = text1.toLowerCase().split("\\s+");
        String[] words2 = text2.toLowerCase().split("\\s+");

        int totalWords = Math.max(words1.length, words2.length);
        int matchedWords = 0;

        for (String word1 : words1) {
            for (String word2 : words2) {
                if (wordMatch(word1, word2) > 65) {
                    matchedWords++;
                    break;
                }
            }
        }

        return (int) (((double) matchedWords / totalWords) * 100);
    }

    public static int wordMatch(String word1, String word2) {
        word1 = word1.toLowerCase().trim();
        word2 = word2.toLowerCase().trim();

        int maxLength = Math.max(word1.length(), word2.length());
        if (maxLength == 0)
            return 100;

        int distance = levenshteinDistance(word1, word2);
        return (int) ((1.0 - ((double) distance / maxLength)) * 100);
    }

    private static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public String quetion(String question) {
        question = question.trim();
        if (map.containsKey(question))
            return map.get(question);

        if (question.endsWith("?") || question.endsWith(".")) {
            question = question.substring(0, question.length() - 1);
        }

        String[] chunkData = question.split(",");
        StringBuilder answer = new StringBuilder();

        for (String temp : chunkData) {
            answer.append(quetionAnswer(temp.trim())).append(" ,");
        }

        return answer.substring(0, answer.length() - 2);
    }

    public String quetionAnswer(String question) {
        String bestMatch = null;
        int highestSimilarity = 0;

        for (String key : map.keySet()) {
            int similarity = findSimilarityPercentage(question, key);

            if (similarity > highestSimilarity && similarity > 67) {
                highestSimilarity = similarity;
                bestMatch = key;
            }
        }

        return (bestMatch != null) ? map.get(bestMatch) : "not found answers";
    }

}

public class AI {
    public static void main(String[] args) {
        Query query = new Query();
        query.grab();

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Ask a question");
            String ask = sc.nextLine();
            switch (ask) {
                case "exit": {
                    flag = false;
                    break;
                }

                default:
                    System.out.println("");
            }
            System.out.println(query.quetion(ask));
        }
    }
}
