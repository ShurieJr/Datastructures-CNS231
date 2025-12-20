package Recursion;

public class powerRe {
    static void main() {
        System.out.println(power(2,3));
    }
    static int power(int x , int n){
        if(n==0)
            return 1;
        else
            return x * power(x , n-1);
    }
}
