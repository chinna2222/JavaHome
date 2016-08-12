package basicdesign;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alex on 01.07.2016.
 */
public class TaskNumberOne {
    public static int number(int x){
        int sum = 0;
        for(int i = 0; i <= 100;i++) {
            if (i % x == 0) {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Сумма последовательностей кратных 2:"+number(2));
        System.out.println("Сумма последовательностей кратных 3:"+number(3));
        System.out.println("Сумма последовательностей кратных 5:"+number(5));
        System.out.println("Сумма последовательностей кратных 7:"+number(7));
        System.out.println(number(7)-number(2));
        System.out.println(number(5) / number(3));

    }

}
