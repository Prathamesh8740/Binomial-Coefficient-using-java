import java.util.Scanner;
public class BinCoeff {
    //function/method for factorial
    public static int fact(int n){
        int f = 1 ;
        for(int i=1; i<=n ;i++){
            f = f* i;
        }    
        return f;    
    }
    //Binomial Coefficient of given number
    public static int BinCoeff(int n,int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int BinCoeff = n_fact / (r_fact*nmr_fact);
        return BinCoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Number n =");
        int n = sc.nextInt();
        System.out.print("Enetr Number r =");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient is " + BinCoeff(n,r));
       
    }
    
}
