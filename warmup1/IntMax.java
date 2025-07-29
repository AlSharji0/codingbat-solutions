public class IntMax {
public int intMax(int a, int b, int c) {
  int[] x = {a, b, c};
  int max = Integer.MIN_VALUE;
  for (int num : x) {
    if (num > max) max = num;
  }
  
  return max;
}
}
