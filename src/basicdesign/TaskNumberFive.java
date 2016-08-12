package basicdesign;

import java.util.Arrays;

/**
 * Created by Alex on 04.07.2016.
 */
public class TaskNumberFive {
    public static void printArr(int arr [][]){
        System.out.println("Вывод всех элемнтов");
        for (int i = 0 ; i < arr.length ;i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void  reverseprintArr(int arr [][]){
        System.out.println("Вывод всех элементов в обратном порядке");
        for (int i = arr.length-1 ; i >= 0 ;i--){
            for(int j = arr[i].length-1; j >=0;j--){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static int evenPrint(int arr [][]){
        int sumseven = 0;
        System.out.println("Выводим для каждой четной строки выводим все четные элементы массива");
        for (int i = 0 ; i < arr.length ;i++){
            if(i % 2 == 0){
                for (int j = 0 ; j < arr[i].length;j++){
                    if(arr[i][j] % 7 == 0){
                        sumseven+=arr[i][j];
                    }
                    if(arr[i][j] % 2 == 0){
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        return sumseven;
    }
    public static int oddPrint(int arr [][]){
        int sumthree = 1;
        System.out.println("Выводим  для каждого нечетного столбца выводим все нечетные элементы массива");
        for (int i = 0 ; i < arr.length ;i++){
            if(i % 2 != 0){
                for (int j = 0 ; j < arr[i].length;j++){
                    if(arr[i][j] % 3 == 0){
                        sumthree*=arr[i][j];
                    }
                    if(arr[i][j] % 2 != 0){
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        return sumthree;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,8,9,5},{6,7,3,4},{10,14,34,56}};
        int sumseven = 0;
        int sumthree = 0;

        printArr(arr);
        reverseprintArr(arr);
        evenPrint(arr);
        oddPrint(arr);
        sumseven = evenPrint(arr);
        sumthree = oddPrint(arr);

        System.out.println("сумму всех элементов, кратных 7 в четных строках "+sumseven);
        System.out.println("произведение элементов, кратных 3 в нечетных строках "+sumthree);

    }
}
