package hillel.tsukanova;


public class AnagramDZ {
        String s = "anagram";
        String t = "nagaram";

        boolean ff = isAnagram(s, t);
        public static boolean isAnagram (String s, String t){
        String processedS = preprocess(s);
        String processedT = preprocess(t);

        if (processedS.length() != processedT.length()) {
            return false;
        }
        int[] kilkict = new int[256];

        for (int i = 0; i < processedS.length(); i++) {
            kilkict[processedS.charAt(i) - 'a']++;
            kilkict[processedT.charAt(i) - 'a']--;
        }
        for (int g : kilkict) {
            if (g != 0) {
                return false;
            }
        }
        return true;
    }
        public static String preprocess (String source){
        return source.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
    }
