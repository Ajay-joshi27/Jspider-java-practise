package practise;

public class PrimeNumber {
    public static void main(String[] args) {
        int start=1;
        int end=1000;
        for (int i =start; i <=end; i++) {
            int n=i;
            int count=0;
            for (int j = 1; j <=n; j++) {
                if (n%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(i);
            }
        }
    }
}
