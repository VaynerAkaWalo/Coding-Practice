package problems.leetcode.grind75.binarysearch;

public class FirstBadVersion extends VersionControl{

    public int firstBadVersion(int n) {
        if (n < 2) return n;
        if (n == 2) return isBadVersion(1) ? 1 : 2;

        int mid = n / 2;

        return isBadVersion(mid) ? firstBadVersion(0, mid) : firstBadVersion(mid, n);
    }

    private int firstBadVersion(int start, int n) {
        if (start == n) return n;
        if (Math.abs(n - start) == 1) return isBadVersion(start) ? start : n;
        int mid = start + (n - start) / 2;

        return isBadVersion(mid) ? firstBadVersion(start, mid) : firstBadVersion(mid, n);
    }
}


class VersionControl {
    public boolean isBadVersion(int num) {
        return false;
    }
}
