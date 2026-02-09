import java.util.*;

public class TypeCasting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Automatic Type converion
        int a='A';
        System.out.println(a);
        float num=sc.nextFloat();
        System.out.println(num);
        // int n=87.44f; Error
        //We do typecasting
        int n=(int)(87.44f);
        System.out.println(n);
    }
    
}
