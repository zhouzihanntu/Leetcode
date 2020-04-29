# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
#class MountainArray:
#    def get(self, index: int) -> int:
#    def length(self) -> int:

class findInMountainArray:
    def findMountainTop(self, mountain_arr: 'MountainArray'):
        left = 0
        right = mountain_arr.length() - 1
        while left < right:
            mid = left + (right - left) // 2
            midNum = mountain_arr.get(mid)
            if midNum < mountain_arr.get(mid + 1):
                left = mid + 1
            else:
                right = mid
        return left
    
    def findAscendPath(self, target, mountain_arr, top):
        left = 0
        right = top
        while left < right:
            mid = left + (right - left) // 2
            if mountain_arr.get(mid) < target:
                left = mid + 1
            else:
                right = mid

        return left if mountain_arr.get(left) == target else -1

    def findDescendPath(self, target, mountain_arr, top):
        left = top + 1
        right = mountain_arr.length() - 1
        while left < right:
            mid = left + (right - left) // 2
            if mountain_arr.get(mid) > target:
                left = mid + 1
            else:
                right = mid
        return left if mountain_arr.get(left) == target else -1

    def solution(self, target: int, mountain_arr: 'MountainArray') -> int:
        top = self.findMountainTop(mountain_arr)
        res = self.findAscendPath(target, mountain_arr, top)
        if res != -1:
            return res
        res = self.findDescendPath(target, mountain_arr, top)
        return res


