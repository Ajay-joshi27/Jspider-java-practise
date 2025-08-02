package practise;

public class Armstrong {
    public static void main(String[] args) {
        int start=1;
    int end=1000;
       if (start>0 && end>0) {
    for (int i = start; i <=end; i++) {
        int count=0;
        int sum=0;
        int n=i;
        int temp=n;

        while (n>0) {
            count++;
            n=n/10;

        }
        n=temp;
            for (int j = 0; j <count; j++) {
                int digit=n%10;
                n=n/10;
                int product=1;
                for (int k = 0; k <count; k++) {
                    product*=digit;

                }
                sum+=product;
                if (sum==temp) {
                    System.out.println(i);
                }
            }

    }
}
    }
   
}
