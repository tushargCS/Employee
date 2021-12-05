//Q7 Write a program to check if the program has received command line arguments or not.
//        If the program has not received arguments then print "No Values",
//        else print all the values in a single line separated by ,(comma)
//
//        Example1) java Example
//        O/P: No values
//
//        Example2) java Example Mumbai Bangalore
//        O/P: Mumbai,Bangalore
//
//        [Hint: You can use length property of an array to check its length]
import java.util.Scanner;
public class TEST {
    public static void main(String[] args) {
        String I = args[0];
        String i= args[1];
        if(args.length>0){
            System.out.println(I+","+i);
        }
        else if(args.length<=0){
            System.out.println("no value");
        }
    }
}
