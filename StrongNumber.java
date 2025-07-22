public class StrongNumber {
    public static void main(String[] args) {
        int number=145;

      
        int sum=0;
        while (number>0) {
            int digit=number%10;
             int fact=1;
            while (digit>0) {
                fact=fact*digit;
                digit--;

            }
            number=number/10;
            sum+=fact;
           // fact=1;
            }
            System.out.println(sum);
    }
}
