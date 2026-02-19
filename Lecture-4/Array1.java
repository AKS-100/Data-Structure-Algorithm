import java.util.*;

public class Array1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //syntax
        int[] arr=new int[5];
        int[] arr1={1,2,3,45,5};
        System.out.println(arr[3]);
        //Printing and taking Input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        
    }
}
