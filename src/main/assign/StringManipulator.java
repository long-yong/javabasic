package assign;

public class StringManipulator {
    public static Integer getIndexOrNull(String str, char c) {
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==c) return i;
        }
        return null;
    }

    public static Integer getIndexOrNull(String str, String substr) {
        for(int i=0;i<str.length();i++) {
            for (int j = 0; j < substr.length(); j++) {
                if (i + j >= str.length()) return null;
                if (str.charAt(i + j) != substr.charAt(j)) break;
                if (j == substr.length() - 1) return i;
            }
        }
        return null;
    }

    public static String concatSubstring(String str1, int start, int end, String str2) {
        return str1.substring(start,end)+str2;
    }

}
