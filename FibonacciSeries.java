import java.util.Scanner;

public class FibonacciSeries {

        static int n1=0,n2=1,n3=0;
        static void printFibonacci(int c){
            if(c>0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+n3);
                printFibonacci(c-1);
            }
        }
        public static void main(String args[]){
            System.out.println("Enter the number ");
            Scanner sc=new Scanner(System.in);
            int  c=sc.nextInt();
            System.out.print(n1+" "+n2);
            printFibonacci(c-2);
        }
    }

