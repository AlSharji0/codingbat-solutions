public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  
  if ((a < 0 && b > 0) || (a > 0 && b < 0))
    return true;
    
  return false;
}
}
