public class Setbit{
    public static void main(String[]args){
        int a=5;
        int position=1;
        if((a&(1<<position))!=0){
            System.out.println("set bit");
        }else{
            System.out.println("not a set bit");
        }
    }
}