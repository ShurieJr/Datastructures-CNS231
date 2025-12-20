package Recursion;

public class LinearArrSum {
    static void main() {
        int marks[] = {30 ,50 , 100 ,10 , 10};
        System.out.println(linearSum(marks , marks.length-1 ));
    }
    static int linearSum(int data[] , int index){
        if(index == 0 )
            return data[0];
        else
            return data[index] + linearSum(data , index-1);
    }
}
