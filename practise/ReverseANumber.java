package practise;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=123;
int sum=0;
        while (n>0) {
            int digit=n%10;
            n=n/10;
            sum=sum*10+digit;
        }
        System.out.println(sum);
    }
}
