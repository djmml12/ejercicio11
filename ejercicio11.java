
import java.util.*;
public class ejercicio11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count_odd = 0; //impar
        int count_averageEven = 0; //par
        int count_numbers =0; //13-24
        int bigger = 0;
        int count = 0;
        int sumEven = 0;
        do{
            System.out.println("ingresar numero entre 0 y 36 ");
            int n = scanner.nextInt();
            if(0<=n && n<=36){
                if(n%2!=0){
                    count_odd++;
                }if(n%2==0 && n!=0){
                    count_averageEven++;
                    sumEven+=n;
                }if(13<=n && n<=24){
                    count_numbers++;
                }if(n>bigger){
                    bigger=n;
                }
                count++;
            
            }
            else{
                System.out.println("intenta de nuevo");
            }
        } while(count<10);
        System.out.println("cantidad de numeros impares "+count_odd);
        System.out.println("promedio de numeros pares "+(sumEven/count_averageEven));
        System.out.println("cantidad de numeros entre 13 y 24 "+ count_numbers);
        System.out.println("el numero mas grande "+bigger);
    }
}