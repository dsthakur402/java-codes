import java.util.Scanner;

public class que3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("cost of pencil:");
        float a=s.nextFloat();
        System.out.println("cost of pen:");
        float b=s.nextFloat();
        System.out.println("cost of eraser:");
        float c=s.nextFloat();
        float total=(a+b+c);
        System.out.println("total cost="+total);
        float gst =total * 0.18f;
        System.out.println("gst="+gst);
        float price=gst+total;
        System.out.println("total cost(incl. gst)="+price);
        
        
        //ans 4
        
        int $=24;
        System.out.println($);

    }
}
