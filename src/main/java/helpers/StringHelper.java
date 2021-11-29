package helpers;

public class StringHelper {
    public static String[] splitStringWithChar(String s, String splitChar) {
        String[] result = s.split(splitChar, 2);
        return result;
    }
}
