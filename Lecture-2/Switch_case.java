import java.util.Scanner;

public class Switch_case{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        switch(s){
            case "Mango"->System.out.println("King of fruits");
            case "Apple"->System.out.println("Healthy");
            case "Grape","Orange"->System.out.println("Citirus");
            default->System.out.println("Enter a valid fruit");
        }
    }
    
}
