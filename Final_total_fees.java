//Q2. At GLA College of  Programming,
//        the final school fees to be paid is calculated as follows.
//        • Original Fees should be greater than or equal to R 50 000
//        • Minimum fixed deposit of R 10 000
//        • If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
//        • Final total fees will also include the following
//        1. School Levy is 10% of original fees
//        2. Sports fee is 5% of the original fees.
//        Write a program the calculates the final total fees to be paid.

import java.util.Scanner;
class GLA {
    public static void main(String[] args) {
        int of=50000;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the deposit fee");
       int fees= obj.nextInt();
        if(fees<=10000){
            System.out.println("summit more than this ");
        }
       else if(fees>25000){
            of=of-2500;
            of=of+2500+5000;
            int tf= of-fees;
            System.out.println("the final total fees to be paid "+tf);
        }
    }
      public void method(){
        GLA obj= new GLA();
        obj.method();
      }
}
