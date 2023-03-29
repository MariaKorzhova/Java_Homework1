// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10
import java.util.Scanner;
class Task_2{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n (количество чисел): ");
        int n = iScanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<array.length;i++){
            array[i] = iScanner.nextInt();
        }
        System.out.printf("Введите число, на которое нужно умножить все числа: ");
        int x = iScanner.nextInt();
        for (int i=0; i<array.length;i++){
            array[i] = array[i]*x;
            System.out.println(array[i]);
            }
    }
}
