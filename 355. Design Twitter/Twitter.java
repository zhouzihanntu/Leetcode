import java.util.*;
class Twitter {
    private Map<Integer, Set<Integer>> followMap;
    private List<int[]> stack;
    
    /** Initialize your data structure here. */
    public Twitter() {
        followMap = new HashMap<Integer, Set<Integer>>();
        stack = new ArrayList<int[]>();  
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        stack.add(new int[] {userId, tweetId});
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList();
        List<Integer> followUser = new ArrayList();
        int count = 0;
        followUser.add(userId);
        if (followMap.containsKey(userId)) {
            for (int i: followMap.get(userId)) { 
                followUser.add(i);
            }
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            int[] pair = stack.get(i);
            if (followUser.contains(pair[0])) {
                res.add(pair[1]);
                count ++;
                if (count == 10) {
                    break;
                }
            }
        }
        return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }
        Set<Integer> set = new HashSet<>();
        if (followMap.containsKey(followerId)) {
            for (int id: followMap.get(followerId)) {
                set.add(id);
            }
        }
        set.add(followeeId);
        followMap.put(followerId, set);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId) && followMap.get(followerId).contains(followeeId)) {
            Set<Integer> set = new HashSet<>();
            for (int id: followMap.get(followerId)) {
                if (id != followeeId) {
                    set.add(id);
                }
            }
            followMap.put(followerId, set);
        }
        return;
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */