class Twitter:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.stack = []
        self.followDict = {}
        

    def postTweet(self, userId: int, tweetId: int) -> None:
        """
        Compose a new tweet.
        """
        self.stack.append((userId, tweetId))
        

    def getNewsFeed(self, userId: int) -> List[int]:
        """
        Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
        """
        res = []
        followUser = [userId]
        count = 0
        if userId in self.followDict:
            followUser = followUser + self.followDict[userId]
        for i in range(len(self.stack)-1, -1, -1):
            if self.stack[i][0] in followUser:
                res.append(self.stack[i][1])
                count = count + 1
            if count == 10:
                break
        return res
            

    def follow(self, followerId: int, followeeId: int) -> None:
        """
        Follower follows a followee. If the operation is invalid, it should be a no-op.
        """
        if followerId == followeeId:
            return
        if followerId in self.followDict:
            if followeeId not in self.followDict[followerId]:
                self.followDict[followerId].append(followeeId)
        else:
            self.followDict[followerId] = [followeeId]
        

    def unfollow(self, followerId: int, followeeId: int) -> None:
        """
        Follower unfollows a followee. If the operation is invalid, it should be a no-op.
        """
        if followerId in self.followDict and followeeId in self.followDict[followerId]:
            self.followDict[followerId].remove(followeeId)

        


# Your Twitter object will be instantiated and called as such:
# obj = Twitter()
# obj.postTweet(userId,tweetId)
# param_2 = obj.getNewsFeed(userId)
# obj.follow(followerId,followeeId)
# obj.unfollow(followerId,followeeId)