import java.util.*;
public class Facultysalary{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int pp=sc.nextInt();
        int exp=sc.nextInt();
        double currsal=sc.nextInt();
        double newsal;
        if(pp>=5&&exp>=10&&currsal>=50000)
        {
            newsal=(currsal+(currsal/100)*10);
            System.out.println(newsal);
        }
        else if(pp>=3&&pp<5&&exp>=5&&exp<10&&currsal>=30000&&currsal<=50000)
        {
            newsal=(currsal+(currsal/100)*8);
            System.out.println(newsal);
        }
        else if((pp>=1&&pp<3&&exp>=1&&exp<5&&currsal>=150000&&currsal<=3000))
        {
            newsal=(currsal+(currsal/100)*6);
             System.out.println(newsal);
        }
        else
        {
             System.out.println("you r not eligible for increment");
        }
    
    }}
