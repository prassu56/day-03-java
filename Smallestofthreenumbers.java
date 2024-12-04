public class Smallestofthreenumbers{
    public static void main(String[]args){
        int a=10;
        int b=2;
        int c=8;
        if((a<b)&&(a<c))
        {
            System.out.println("a  is smallest");
        }
        else if((b<a)&&(b<c))
        {
             System.out.println("b  is smallest");
        }
        else
        {
             System.out.println("c  is smallest");
        }

    }
}