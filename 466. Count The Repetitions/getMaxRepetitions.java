class getMaxRepetitions {
    public int solution(String s1, int n1, String s2, int n2) {
        if(n1 == 0) return 0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int l1 = s1.length();
        int l2 = s2.length();
        int couts1 = 0;
        int couts2 = 0;
        int p = 0;
        Map<Integer,int[]> mp = new HashMap<>();
        while(couts1 < n1){
            for(int i = 0;i < l1;i++){
                if(c1[i] == c2[p]){
                    p ++;
                    if(p == l2){
                        p = 0;
                        couts2 ++;
                    }
                }
            }
            couts1 ++;
            if(!mp.containsKey(p)){
                mp.put(p, new int[]{couts1, couts2});
            }
            else{
                int[] last = mp.get(p);
                int circle1 = couts1 - last[0];
                int circle2 = couts2 - last[1];
                couts2 = couts2 + circle2 * ((n1 - couts1) / circle1);
                couts1 = couts1 + ((n1 - couts1) / circle1) * circle1;
            }
        }
        return couts2/n2;
    }
}