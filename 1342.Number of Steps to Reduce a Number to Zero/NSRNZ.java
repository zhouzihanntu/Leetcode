public class NSRNZ{
    public int Solution(int num){
        int count = 0;
        int flag = 0;
        while(num > 0){
            flag = num & 1;
            if(flag > 0){
                num = num ^ 1;
            } 
            else{
                num = num >> 1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] argvs){
        NSRNZ nsrnz = new NSRNZ();
        int num = 123;
        int step = nsrnz.Solution(num);
        System.out.println(step);
    }
}