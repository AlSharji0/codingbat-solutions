public class HasTeen {
public boolean hasTeen(int a, int b, int c) {
  int[] nums = {a, b, c};
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] >= 13 && nums[i] <= 19)
      return true;
  }
  return false;
}
}
