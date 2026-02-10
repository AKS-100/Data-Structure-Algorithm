public class Revesre{
    public static void main(String[] args){
        int n=1342;int s=0;
        while(n>0){
            int a=n%10;
            n=n/10;
            s=s*10+a;
        }
        System.out.printf("Reversed Number %d",s);
    }
    
}
