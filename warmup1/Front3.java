public class Front3 {
    public String front3(String str) {
    String x = str.length() >= 3 ? str.substring(0, 3) : str;
    String result = x + x + x;
    return result;
    }
}
