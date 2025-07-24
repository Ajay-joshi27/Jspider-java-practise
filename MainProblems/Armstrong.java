public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int count=0;
        int sum=0;
        while (n>0) {
            n/=10;
            count++;
        }
             n=temp;
        while (n>0) {
            int product=1;
            int a=n%10;
            n=n/10;
            for (int i = 0; i <count; i++) {
                product*=a;
            }
            sum+=product;
        }
        if (sum==temp) {
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("it is not an armstrong number");
        }
    }
}
