
import java.util.Scanner;

public class Main2{
    public static int contador(int interact) {
        int c=1;
        while(interact > 1) {
       
            if(interact%2!=0) {
            	interact = 3*interact+1;
            }else {
            	interact=interact/2;
            }
            c++;
        }return c;
    }
    public static void main(String args[]) {
        
    	int max=0;
        int x,y,z;
        
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            max=0;
            x=scan.nextInt();
            y=scan.nextInt();
            boolean result = false;
            if(x>y) {
                int temp = x;
                x=y;
                y=temp;
                result = true;
            }
            for(int i=x;i<=y;i++)
            {
                if((x=contador(i))>max) max = x;
            }

            if(result) {
                System.out.println(y+" "+x+" "+max);
            }else {
                System.out.println(x+" "+y+" "+max);
            }
        }
    }
}
