package practise;

public class Pallindrome {
    public static void main(String[] args) {
        int start=0;
        int end=1000;
        for (int i = start; i <end; i++) {
            int n=i;
            int temp=n;
            
            int sum=0;
            while(n>0)
            {
                int  digit=n%10;
                n=n/10;
                sum=sum*10+digit;  
                }
                if (sum==temp) {
                    System.out.println(i);
                }
            }
        }
    }

