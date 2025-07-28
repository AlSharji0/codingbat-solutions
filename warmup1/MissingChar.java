public class MissingChar {
  public String missingChar(String str, int n) {
    char[] chars = str.toCharArray();
    char[] newString = new char[chars.length - 1];
    int j = 0;
    for (int i = 0; i < chars.length; ++i) {
      if (i != n) newString[j++] = chars[i];
    }
    return new String(newString);
  }
}
