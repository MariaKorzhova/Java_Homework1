// Task_3.
// Реализовать простой калькулятор (+,-,=,*), 
// только с целыми числами.




import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("Введите, что нужно сделать с числами (+, -, *, /): ");
        String text = iScanner2.nextLine();
        System.out.println(text);
        int res = 0;
        //String res1 = "ty";
        //System.out.println(res1);
        if (text.equals("+")){
            res = a+b;
        }
        if (text.equals("-")){
            res = a-b;
        }
        if (text.equals("*")){
            res = a*b;
        }
        if (text.equals("/")){
            res = a/b;
        }
        System.out.println(res);
        iScanner.close();
        iScanner2.close();
    }
}
