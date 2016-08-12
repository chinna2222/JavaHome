package basicdesign;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Alex on 02.07.2016.
 */
public class TaskNumberTwo {
    public static void main(String[] args) {
        Random rand = new Random();
        int randnum = rand.nextInt(99);

        switch (randnum){
            case 10:
                System.out.print("Десять");
                break;
            case 11:
                System.out.print("Одинадцать");
                break;
            case 12:
                System.out.print("Двенадцать");
                break;
            case 13:
                System.out.print("Тринадцать");
                break;
            case 14:
                System.out.print("Четырнадцать");
                break;
            case 15:
                System.out.print("Пятнадцать");
                break;
            case 16:
                System.out.print("Шестнадцать");
                break;
            case 17:
                System.out.print("Семьнадцать");
                break;
            case 18:
                System.out.print("Восемьнадцать");
                break;
            case 9:
                System.out.print("Девятнадцать");
                break;
            }

        switch (randnum-(randnum % 10)){
            case 20:
                System.out.print("Двадцать");
                break;
            case 30:
                System.out.print("Тридцать");
                break;
            case 40:
                System.out.print("Сорок");
                break;
            case 50:
                System.out.print("Пятьдесят");
                break;
            case 60:
                System.out.print("Шестьдесят");
                break;
            case 70:
                System.out.print("Семьдесят");
                break;
            case 80:
                System.out.print("Восемьдесят");
                break;
            case 90:
                System.out.print("Девяносто");
                break;
            case 9:
                System.out.print("Девять");
                break;
        }
        switch (randnum % 10){
            case 1:
                System.out.print("Один");
                break;
            case 2:
                System.out.print("Два");
                break;
            case 3:
                System.out.print("Три");
                break;
            case 4:
                System.out.print("Четыре");
                break;
            case 5:
                System.out.print("Пять");
                break;
            case 6:
                System.out.print("Шесть");
                break;
            case 7:
                System.out.print("Семь");
                break;
            case 8:
                System.out.print("Восемь");
                break;
            case 9:
                System.out.print("Девять");
                break;
        }
    }
}
