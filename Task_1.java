// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        int[] array = new int[1000];
        for (int i=0; i<1000;i++){
            array[i] = (i+1) * (i+1) * (i+1);
            System.out.println(array[i]);
        }
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        System.out.println(array[a-1]);
        System.out.println(array[b-1]);
        // for (int i=0; i<1000;i++){
        //     if (array[i] == a*a*a || array[i] == b*b*b){
        //     System.out.println(array[i]);
        //     }
        }
    }
