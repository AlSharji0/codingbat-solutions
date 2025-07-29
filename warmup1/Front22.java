public class Front22 {
    public String front22(String str) {
    char[] chars = str.toCharArray();
    int take = 2;

    if (chars.length < take) {
        take = chars.length;
    }

    String front = "";
    for (int i = 0; i < take; i++) {
        front += chars[i];
    }

    return front + str + front;
    }
}
