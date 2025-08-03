package patternPrinting;

public class NumberPattern1 {

        public static void main(String[] args) {
            int count=0;
            int counter=0;
            for (int i = 1; i <=5 ; i++) {

               if (i%2!=0) {
                for (int j = 1; j <=5; j++) {
                    count++;
                    counter=count+5;
                    System.out.print(count);
                }
            }
                else
                {
                    for (int j2 =1; j2 <=5; j2++) {
                        System.out.print(counter);
                        counter--;
                        count++;
                    }

                }
                 System.out.println();
               }
               
            }
        }

