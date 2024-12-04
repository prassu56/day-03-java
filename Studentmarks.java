import java.util.*;
public class Studentmarks{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        String s=sc.nextLine();
        boolean p=s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35;
        double avg=(s1+s2+s3+s4+s5)/5;
        if(avg>=80&&avg<=100&&p){
            String f=String.format("%s your status=PASS avg=%fand Grade=A",s,avg);
            System.out.println(f);
        }
        else if(avg>=60&&avg<=80&&p){
            String f=String.format("%s your status=PASS avg=%fand Grade=B",s,avg);
            System.out.println(f);
        }
        else if(avg>=40&&avg<60&&p){
            String f=String.format("%s your status=PASS avg=%fand Grade=C",s,avg);
            System.out.println(f);
        }else{
            String f=String.format("%s your status=FAIL avg=%fand Grade=F",s,avg);
            System.out.println(f);

        }
    }
}