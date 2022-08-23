/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int low = 1;
            int high = n;
            int mid = 0;
                
            // binary search
            while (low <= high) {
                mid = low + (high - low) / 2; // same as (high + low) but this causes arithmetic overflow when both numbers are too large
                
                if (isBadVersion(mid) == true) {
                    if (isBadVersion(mid - 1) == false) { // checks if first true
                        return mid;
                    }
                    high = mid - 1;
                }
                else {
                    if (isBadVersion(mid + 1) == true) { // checks if next n is first true
                        return mid + 1; 
                    }
                    low = mid + 1; 
                }
            }
            return mid;
        }
    }