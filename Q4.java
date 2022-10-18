import java.util.Scanner;
public class Q4 {
    public static void main(String []args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // take input from user
        sc.close();
        System.out.print(num+" ");
        while(num != 1 ) {
            if(num%2 == 0) //num is even
                num = num/2;
            else          //num is odd
                num = num*3 +1;  

            System.out.print(num+" ");
        }
    }
}
