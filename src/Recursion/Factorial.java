package Recursion;

public class Factorial {
    static void main() {
        System.out.println(factorial(5));
        int number=5;
        int result =1;
        for(int i=1; i<=number; i++){
            result *= i;
        }
        System.out.println("result : " + result );
    }

    //factorial
  static int factorial(int num){
        if (num == 1)  //base case
            return 1;
        else  // recursive call
            return num * factorial(num - 1);
    }
}
