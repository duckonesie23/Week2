
import java.util.*;
public class SumofCubes{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        int sum = 0;
        int ones = num%10;
        int tens = ((num%10) - ones) /10;
        System.out.print(ones);
        System.out.print(tens);
        //System.out.print(num);
        /*for(int i=0;thing>10;++i){
            Double temp = thing%(Math.pow(10,i+1));
            thing = (thing-temp)/10;
            System.out.println(thing);
        }*/
    }
}