/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class findInMountainArray {
    public int findMountainTop(MountainArray mountainArr, int size) {
        int left = 0, right = size - 1, mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

    public int findInAscendPath(int target, MountainArray mountainArr, int left, int right) {
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if (mountainArr.get(left) == target) {
            return left;
        }
        return -1;
    }

    public int findInDescendPath(int target, MountainArray mountainArr, int left, int right) {
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mountainArr.get(mid) > target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if (mountainArr.get(left) == target) {
            return left;
        }
        return -1;
    }

    public int solution(int target, MountainArray mountainArr) {
        int size = mountainArr.length();
        int top = findMountainTop(mountainArr, size);
        int res = findInAscendPath(target, mountainArr, 0, top);
        if (res != -1) {
            return res;
        }
        res = findInDescendPath(target, mountainArr, top + 1, size - 1);
        return res;
    }
}