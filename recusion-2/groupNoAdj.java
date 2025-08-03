public boolean groupNoAdj(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;

  target -= nums[start];
  if (groupNoAdj(start + 2, nums, target)) return true;

  target += nums[start];
  if (groupNoAdj(start + 1, nums, target)) return true;

  return false;
}
