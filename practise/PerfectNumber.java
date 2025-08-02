package practise;

public class PerfectNumber {
    public static void main(String[] args) {
        int start=1;
        int end=1000;
        for (int i =start; i <=end; i++) {
            int n=i;
            int sum=0;
            for (int j = 1; j <n; j++) {
                if (n%j==0) {
                    sum+=j;
                }
                
                }
                if (sum==n) {
                    System.out.println(i);
            }
        }
    }
}
