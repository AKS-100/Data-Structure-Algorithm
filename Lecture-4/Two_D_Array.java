import java.util.*;
public class Two_D_Array{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
    int[][] arr=new int[3][3];
    //Input
    for(int i=0;i<arr.length;i++){//ROW
        for(int j=0;j<3;j++){//Coloumn
            arr[i][j]=sc.nextInt();
        }}
    //Output
    for(int i=0;i<arr.length;i++){//ROW
        for(int j=0;j<arr[row].length;j++){//Coloumn
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();

    }
    //Enhanced ForLoop
    for(int[] a:arr){
        System.out.println(Arrays.toString(a));
    }
    
    
    
    }

}
