import java.util.*;
class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
      int n =sc.nextInt();
      int sum=0;
      for(int i=1;i<n;i++)
      {
          if(n%i==0)
          {
              sum+=i;
          }
      }
    //   System.out.print(sum);
        
        if(sum==n)
        {
            System.out.print("it is perfect number");
        }
        else{
            System.out.println("It Is Not A Perfect Number");
        }
    }
}