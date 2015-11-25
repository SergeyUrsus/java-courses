public class Calculate{
    public static void main(String[] args){
        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);


        int summ = first + second;
        System.out.println("Sum  " + summ);

        int subtraction = first - second;
        System.out.println("subtraction  " + subtraction);

        int multiplication = first * second;
        System.out.println("multiplication  " + multiplication);

        int division = first / second;
        System.out.println("division  " + division);
     }
}