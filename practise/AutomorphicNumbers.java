package practise;

public class AutomorphicNumbers {
    public static void main(String[] args) {
        int start=0;
        int end=1000;
        for (int i = start; i<=end; i++) {
            int n=i;
            int temp=n;
            int square=n*n;
            // int temp=square;
            int sum=0;
            int count=0;
            while (n>0) {
                count++;
                n/=10;
            }
            n=temp;
           
               int power=(int)Math.pow(10, count);
               int digit=square%power;
               sum=digit;
            
            if (sum==n) {
                System.out.print(i);
                System.out.println();
            }
            // System.out.println();
        }
    }

}
