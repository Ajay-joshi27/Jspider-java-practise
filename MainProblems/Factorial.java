public class Factorial {
    public static void main(String[] args) {
        int sum=1;
        int number=5;

            while (number>0) {
                sum=sum*number;
                number--;
            }
            System.out.println(sum);
    }
}
