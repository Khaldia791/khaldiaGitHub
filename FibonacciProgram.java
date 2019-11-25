import java.util.Scanner;
public class FibonacciProgram {

public static void main(String[] args) {

int Num1 = 0;
int Num2 = 1;
int Sum=Num1+Num2;

Scanner scan = new Scanner(System.in);
System.out.print("Enter any number: ");
int max = scan.nextInt();
scan.close();

System.out.print("0, 1, ");

int i = 0;  
        while(i<=max){
        
          System.out.print(Sum + ", ");
          Num1 = Num2;
          Num2 = Sum;
          Sum = Num1+Num2;
          i++;
        }
        
   }

private static int nextLN() {
// TODO Auto-generated method stub
return 0;
}

}


