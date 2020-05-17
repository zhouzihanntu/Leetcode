class Solution {
    private int k = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] in = new int[numCourses];
        int[] ans = new int[numCourses];
        List[] edges = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges[i] = new ArrayList<Integer>();
        }
        for (int[] pre: prerequisites) {
            in[pre[0]] ++;
            edges[pre[1]].add(pre[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                ans[k ++] = i;
                in[i] = -1;
                topologicalSort(edges, edges[i], in, ans);
            }
        }
        return k == numCourses ? ans : new int[0];
    }

    public void topologicalSort(List[] edges, List<Integer> list, int[] in, int[] ans) {
        for (int course: list) {
            in[course] --;
            if (in[course] == 0) {
                ans[k ++] = course;
                in[course] = -1;
                topologicalSort(edges, edges[course], in, ans);
            }
        }
    }
}