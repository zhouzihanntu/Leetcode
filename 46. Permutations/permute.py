class permute:
    def __init__(self):
        self.res = []

    def backTrack(self, nums, track):
        if len(nums) == len(track):
            self.res.append(track[:])
            return
        for i in nums:
            if i in track:
                continue
            track.append(i)
            self.backTrack(nums, track[:])
            track.pop()
    
    def solution(self, nums: List[int]) -> List[List[int]]:
        track = []
        self.backTrack(nums, track)
        return self.res
    