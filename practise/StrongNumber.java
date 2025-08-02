package practise;

public class StrongNumber {
public static void main(String[] args) {
      int start=10;
        int end=1000;
        
        for (int i = start; i <=end ; i++){
            int n=i;
            int temp=n;
            int sum=0;
           while (n>0) {
                int digit=n%10;
                n=n/10;
                int factorial=1;
                for (int k = 1; k <=digit; k++) {
                    factorial*=k;
                }
                sum+=factorial;
            }
            if (sum==temp) {
                System.out.println(i);
            }

        }
}
}
