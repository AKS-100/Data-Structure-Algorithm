import java.util.*;
public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean a=isPrime(n);
        System.out.println(a);
    }
    static boolean isPrime(int n){
        int ii=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){ii=1;break;}
        }
        if(ii==1)return true;
        else{return false;}
    }
}
