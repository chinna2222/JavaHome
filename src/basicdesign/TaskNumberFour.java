package basicdesign;

/**
 * Created by Alex on 02.07.2016.
 */
public class TaskNumberFour {
    public static void backNumber(int arr[]){
        System.out.println("Вывод в обратном порядке");
        for(int i = arr.length-1; i >= 0 ; i-- ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void evenNumber(int arr[]){
        System.out.println("Вывод четных чисел");
        for(int i = 0; i < arr.length ; i++ ){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void oddNumber(int arr[]){
        System.out.println("Вывод не четных чисел");
        for(int i = 0; i <arr.length ; i++ ){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static int multiples(int arr[],int x){
        int sum = 1;
        for(int i = 0; i < arr.length ; i++ ){
            if(arr[i] % x == 0){
                sum*=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        backNumber(arr);
        evenNumber(arr);
        oddNumber(arr);
        System.out.println("Произведение элементов, кратных 3:"+multiples(arr,3));
    }
}
