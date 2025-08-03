public int max1020(int a, int b) {
  return (b >= 10 && b <= 20 && (a < 10 || a > 20 || b > a)) ? b : (a >= 10 && a <= 20 ? a : 0);
}
