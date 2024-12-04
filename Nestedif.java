import java.util.*;
public class Nestedif{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("A is smaller");
            }else{
              System.out.println("C is smaller");  
            }
        }else{
            if(b<c){
              System.out.println("B is smaller");    
            }else{
              System.out.println("C is smaller");  

            }
        }
    }
}