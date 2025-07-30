public class BackAround {
    public String backAround(String str) {
    char[] x = str.toCharArray();
    char last = x[x.length-1];
    return last + str + last;
    }
}
