import java.util.*;

public class Case_Check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().trim().charAt(0);
        if(c>='a'&&c<='z')System.out.println("Lower Case");
        else{System.out.println("Upper Case");}

    }
}
