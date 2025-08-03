public class FrontBack {
    public String frontBack(String str) {
        if (str.isEmpty()) return str;

        char[] oldString = str.toCharArray();
        char[] newString = oldString.clone();
        newString[0] = newString[newString.length - 1];
        newString[oldString.length - 1] = oldString[0];

        return new String(newString);
    }
}
