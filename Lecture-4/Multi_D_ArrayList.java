import java.util.*;
public class Multi_D_ArrayList{
    public static void main(String[] args) {
        //syntax
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        //initialize
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());}

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }}
    }
}
