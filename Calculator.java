import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        String yn;
    do{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number:");
    int n1=sc.nextInt();
    System.out.print("Enter second number:");
    int n2=sc.nextInt();
    String operator = sc.next();
    int res;
   
    
        switch (operator) {
            case "+":
                res = n1+n2;
                System.out.println(n1+"+"+n2+"="+res);
                break;
            case "-":
                res = n1-n2;
                System.out.println(n1+"-"+n2+"="+res);
                break;
            case "*":
                res = n1*n2;
                System.out.println(n1+"*"+n2+"="+res);
                break;
            case "/":
                res = n1/n2;
                System.out.println(n1+"/"+n2+"="+res);
                break;
            case "%":
                res = n1%n2;
                System.out.println(n1+"%"+n2+"="+res);
                break;
            
            default:
               System.out.println("Invalid operator!");
        }
        System.out.println("Do you want to continue calculation (click y for yes and n for no):");
        yn= sc.next();

    }while(yn.equals("y")|| yn.equals("Y"));
    }

}
