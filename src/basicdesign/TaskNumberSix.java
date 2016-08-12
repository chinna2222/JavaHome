package basicdesign;

import java.util.Arrays;

/**
 * Created by Alex on 04.07.2016.
 */
public class TaskNumberSix {
    public static void vertical(int arr [][]){
        System.out.println("По вертикали");
        for(int i = arr.length-1; i >= 0;i--) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void gorizont(int arr [][]){
        int maxsize = arr.length - 1;
        int len = Arrays.toString(arr[maxsize]).length();
        System.out.println("По горизонтали");
        for(int i = 0; i < arr.length;i++){
            System.out.printf("%"+len+"s%n",Arrays.toString(arr[i]));
        }
    }
    public static void verticalGorizont2(int arr [][]){
        for(int i = arr.length;i > 0 ;i--){
            arr[arr.length - i] = new int[i];
            int pos = 0;
            for(int g = arr[arr.length - i].length-1;g >=0;g--){
                arr[arr.length - i][pos++]=g;
            }
        }
        System.out.println("По горизонтали и по вертикали");
        int len = Arrays.toString(arr[0]).length();
        for(int i = 0; i < arr.length;i++){
            System.out.printf("%"+len+"s%n",Arrays.toString(arr[i]));
        }
    }
    public static void verticalGorizont(int[][]arr){
        for(int i = 0 ; i < arr.length;i++){
            for(int g = 0 ; g < arr[i].length / 2 ;g++){
                int tmp = arr[i][g];
                arr[i][g] = arr[i][(arr[i].length-1)-g];
                arr[i][(arr[i].length-1)-g] = tmp;
            }
        }
        int maxsize = arr.length - 1;
        int len = Arrays.toString(arr[maxsize]).length();
        System.out.println("По вертикали и горизонтали");
        for(int i = arr.length-1; i >= 0;i--) {
            System.out.printf("%"+len+"s%n",Arrays.toString(arr[i]));
        }

    }
    public static void main(String[] args) {
        int arr [][] = new int[10][];
        for (int i = 0; i < arr.length;i++){
            arr[i] = new int[i+1];
            for (int g = 0; g < arr[i].length;g++){
                arr[i][g] = g;
            }
        }
        vertical(arr);
        gorizont(arr);
        verticalGorizont(arr);
    }
}
