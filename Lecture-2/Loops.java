import java.util.*;
public class Loops {
    public static void main(String[] args){
        int a=10;
        //Conditions
        if(a>10){System.out.println("Hello");}
        else if(a==10){System.out.println("Hello Again");}
        else{System.out.println("Bye");}

        //Loops
        for(int i=0;i<a;i++){
            System.out.println("Hello");
        }
        //While
        while(a>=10){
            System.out.printf("Loop running for %dst time",1);
            a=a-1;
        }
        //Do while
        do{
            System.out.println(a);
            a=a+1;
        }
        while(a<=12);
    }
}
