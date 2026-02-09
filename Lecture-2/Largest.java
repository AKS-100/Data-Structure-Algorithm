import java.util.*;
public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int great;
        if(a>b){
            if(a>c){
                great=a;
            }
            else{great=c;}
        }
        else{
            if(b>c){great=b;}
            else{great=c;}
        }
        System.out.printf("The greatest number is %d",great);

        //Smallest Way
        System.out.printf("\nGreatest value %d",Math.max(c,Math.max(a, b)));
    }
    
}
