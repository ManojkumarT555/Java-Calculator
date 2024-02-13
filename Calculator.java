import java.util.*;

public class Calculator {
    double num1;
    double num2;

    public void setNum1(double num1){
        this.num1=num1;
    }
    public void setNum2(double num2){
        this.num2=num2;
    }

    public double add(){
        return num1+num2;
    }
    public double subtract(){
        return num1-num2;
    }
    public double multiply(){
        return num1*num2;
    }
    public double divide(){
        if(num2!=0){
            return num1/num2;
        }
        else{
            throw new ArithmeticException("Can't Divivde by Zero");
        }
    }

}

class Main extends Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calc=new Calculator();

        System.out.println("Enter Num1 = ");
        calc.setNum1(sc.nextInt());
        System.out.println("Enter Operator = ");
        char op=sc.next().charAt(0);
        System.out.println("Enter Num2 = ");
        calc.setNum2(sc.nextInt());
        sc.close();

        switch(op){
            case '+':{
                System.out.println("Result = "+calc.add());
                break;
            }
            case '-':{
                System.out.println("Result = "+calc.subtract());
                break;
            }
            case '*':{
                System.out.println("Result = "+calc.multiply());
                break;
            }
            case '/':{
                try{
                    System.out.println("Result = "+calc.divide());
                }
                catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                break;
            }
            default:
                System.out.println("Invalid");
        }        
    }
}