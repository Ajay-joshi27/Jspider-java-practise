public class Fibonacci {
    public static void main(String[] args) {
  int  a=0;
  int  b=1;
  int c=0;
    for(int i=1;i<10;i++)
    {
        
        if(i==1){
        System.out.print(a+" ");
            
        }
         else if(i==2)
         {
        System.out.print(b+" ");
             
         }
        else
        {
        b=c;
        System.out.print(c+" ");
             c=a+b;
             a=b;
        }
       
       
    }
    }
}



