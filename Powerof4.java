import java.util.*;
public class Powerof4{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        if((n&(n-2))==0){
            System.out.println("power of 4");
        }else{
             System.out.println("not apower of 4");
        }
    }
}