package basictypes;

/**
 * Created by Alex on 01.07.2016.
 */
//объем, площадь поверхности тетраэдр 
public class TaskNumberThree {
    //Объем цилиндр
    public static double cylinderSize(double r,double h){
        return r * h;
    }
    //​ Площадь боковой  поверхности цилиндра
    public static double areaLaterSurfaceCylinder(double r){
        return r;
    }
    //Объем шара
    public static  double sphereSize(double r){
        return 4.0 / 3 * 3.14 * Math.pow(r,3) ;
    }
    //Площадь поверхности шара
    public static double surfaceAreaSphere(double r){
        return 4 * r;
    }
    //Объем прямоугольного параллелепипеда
    public static double sizeParallelepiped(double a,double b){
        return a * b;
    }
    //площадь поверхности прямоугольного параллелепипеда
    public static  double areaParallepiped(double a,double b ,double c){
        return  2  * (a*b + a*c + b*c);
    }
    //Объем тетраидра
    public static  double sizeTetraider(double a){
        return Math.sqrt(2) / 12 * Math.pow(a,3);
    }
    //Площадь тетраедра по радиусу
    public static  double areaTetraiderRadius (double a){
        return a;
    }
    //Площадь тетраедра по диаметру
    public static double areaTetraiderDiam(double a){
        return a;
    }
    public static void main(String[] args) {
        TaskNumberTwo geomCalc = new TaskNumberTwo();

        System.out.println("Объем цилиндра:"+cylinderSize(geomCalc.areacircleRadius(1),2));
        System.out.println("Площадь боковой поверхности:"+areaLaterSurfaceCylinder(geomCalc.areaReactangle(10,5)));
        System.out.println("Объем шара:"+sphereSize(2));
        System.out.println("Площадь поверхности шара:"+surfaceAreaSphere(geomCalc.areacircleRadius(10)));
        System.out.println("Объем параллелепипеда:"+sizeParallelepiped(geomCalc.areaReactangle(2,3),5));
        System.out.println("Площадь параллелепипеда:"+areaParallepiped(2,3,5));
        System.out.println("Объем тетраэдра:"+sizeTetraider(2));
        System.out.println("Площадь тетраэдра по радиусу:"+areaTetraiderRadius(geomCalc.ringareaRadius(12,20)));
        System.out.println("Площадь тетраэдра по диаметру:"+areaTetraiderDiam(geomCalc.ringareaDiametr(12,20)));
    }
}
