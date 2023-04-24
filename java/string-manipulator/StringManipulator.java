public class StringManipulator {
    public String trimAndConcat(String string, String anotherString) {
        return string.trim().concat(anotherString.trim());
    }

    public int getIndexOrNull(String string, char letter) {
        return string.indexOf(letter);
    }
    
    public int getIndexOrNull(String string, String subString) {
        return string.indexOf(subString);
    }

    public String concatSubstring(String string, int startIndex, int endIndex, String anotherString) {
        return string.substring(startIndex, endIndex).concat(anotherString);
    }
}