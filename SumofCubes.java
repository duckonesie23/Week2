
import java.util.*;
public class SumofCubes{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        int temporary = num;
        int sum = 0;
        input.close();
        
        for(int i=0; num%Math.pow(10,i) != num;++i){
            int place =  temporary % (int)Math.pow(10,i+1);
            temporary -= place;
            place = place/(int)Math.pow(10,i);
            sum += place*place*place;
            System.out.println(sum);
        }
    }
}

/*int ones = num%10;
        temp -= ones;
        int tens = temp%100;
        temp -= tens;
        int tenDigit = tens/10;
        int hundreds = (num - (ones+tens))%1000;
        temp -= hundreds;
        int hundredsDigit = hundreds/100;
        System.out.println(ones + " " + tens + " " + hundreds);
        //System.out.print(num);*/