public class CambioVarible{

    public static void main(String [] args){
        String x="german";
        String y= "abraham";
        String temp;

        temp=x;
        x=y;
        y=temp;

        System.out.println("x es igual a:"+x);
        System.out.println("y es igual a:"+y);



    }
}