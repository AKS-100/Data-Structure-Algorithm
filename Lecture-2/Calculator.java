import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter Opeartor: ");
            char ch=sc.next().charAt(0);
            System.out.println("Enter two numbers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(ch=='+')System.out.printf("Result: %d\n",a+b);
            else if(ch=='+')System.out.printf("Result: %d\n",a-b);
            else if(ch=='*')System.out.printf("Result: %d\n",a*b);
            else{System.out.printf("Result: %d\n",a/b);}
        }
    }
}
