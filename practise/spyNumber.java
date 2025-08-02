package practise;

public class spyNumber {
    public static void main(String[] args) {
        int start=10;
        int end=1000;
        
        for (int i = start; i <=end ; i++) {
            int n=i;
            int temp=n;
            int count =0;
            while (n>0) {
                count++;
                n=n/10;
            }
            n=temp;
            int sum=0;
            for (int j = 0; j <count; j++) {
                int digit=n%10;
                n=n/10;
                sum+=digit;
            }
            n=temp;
            int product=1;
            for (int j = 0; j <count; j++) {
                int digit=n%10;
                n=n/10;
                product*=digit;
            }
            count=0;
            if (sum==product) {
                System.out.println(i);
            }

        }
    }
}
