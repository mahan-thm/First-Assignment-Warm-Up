import java.util.Scanner;

public class Exercises1 {
    public static long factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n ; i++)
        {
            result *= i;
        }
        return result;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public static long fibonacci(int n)
    {
    long first = 1;
    long second = 1;
    long sum = 1;

    for (int i = 3; i <= n; i++)
    {
        sum = first + second;
        first = second;
        second = sum;
    }
        return sum;
    }


    /*
    implement a function that returns a triange for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public static char[][] generateTriangle(int rows) {
        for(int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(factorial(n));
//        int m = input.nextInt();
//        System.out.println(fibonacci(m));
            int o = input.nextInt();
            generateTriangle(o);



    }

}