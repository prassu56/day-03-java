import java.util.*;
public class Powerof2{
    public static void main(String[]args){
        int a=64;
        if((a&(a-1))==0){
            System.out.println("power of 2");
        }else{
             System.out.println("not apower of 2");
        }
    }
}