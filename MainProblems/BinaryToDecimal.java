public class BinaryToDecimal {
        public static void main(String[] args) {
        int count=0;
        int n=1010;
        int temp=n;
        int sum=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
       
        n=temp;
        int power=0;
        
        for(int i=0;i<count;i++)
        {
            int product=0;
            int digit=n%10;
            n=n/10;
            if(digit==1)
            {
            product=(int)Math.pow(2,power);
            }
            else {
            product=0;
            }
          power++;
            sum=sum+product;
        }
        System.out.print(sum);
    }
}