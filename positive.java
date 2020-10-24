import java.util.Scanner;

//tämmöne tää ny on!!
public class positive {
     public static void main(String args[]){
        int x = 0;
        Scanner Num = new Scanner(System.in);
        System.out.println("anna numero");  
        x = Num.nextInt();
        isPositive(x);
        System.out.println(x);
     }
public static boolean isPositive(int number) {
        boolean value = true;
        if(number > 0 ) {
            value = true;
        } else {
            value = false;
        }
        return value;
        //vaikeaa oli sain tehtyä
        
         

        



        
          
    
     }    

}