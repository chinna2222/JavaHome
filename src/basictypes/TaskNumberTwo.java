package basictypes;
import java.lang.Math;
/**
 * Created by Alex on 30.06.2016.
 */
public class TaskNumberTwo {
    double  Pi = 3.14;
    //Длина окружности по радиусу
    public  double circumFerenceRadius(double radius){

        return 2*this.Pi*radius;
    }
    //Длина окружности по диаметру
    public double circumFerenceDiametr(double diam){

        return this.Pi*diam;
    }
    //Площадь окружности по радиусу
    public double areacircleRadius(double radius){

        return this.Pi * Math.pow(radius,2);
    }
    //Площадь окружности по диаметру
    public double areacircleDiametr(double diam) {

        return this.Pi / 4 * Math.pow(diam, 2);
    }
    //Площадь кольца по радиусу
    public double ringareaRadius(double outrad,double innerrad){
        return this.Pi * (Math.pow(outrad,2) - Math.pow(innerrad,2));
    }
    //Площадь кольца по диаметру
    public double ringareaDiametr(double outdiam,double innerdiam){
        return this.Pi / 4 * (Math.pow(outdiam,2) - Math.pow(innerdiam,2));
    }
    //Периметр треугольника
    public double perimetrTriangle(double a,double b,double c){

        return a + b + c;
    }
    //Площадь треугольника
    public double areaTriangle(double a,double h){

        return  a * h / 2;
    }
    //Периметр прямоугольника
    public double perimetrRectangle(double a,double b)
    {
        return 2 * (a + b);
    }
    //Площадь прямоугольника
    public double areaReactangle(double a,double b){

        return a * b ;
    }
    public static void main(String[] args) {
        TaskNumberTwo geomCalc = new TaskNumberTwo();

        System.out.println("Длина окружности по радиусу:"+geomCalc.circumFerenceRadius(2));
        System.out.println("Длина окружности по диаметру:"+geomCalc.circumFerenceDiametr(12));
        System.out.println("Площадь окружности по радиусу:"+geomCalc.areacircleRadius(13));
        System.out.println("Площадь окружности по диаметру:"+geomCalc.areacircleDiametr(5));
        System.out.println("Площадь кольца по радиусу:"+geomCalc.ringareaRadius(6,2));
        System.out.println("Площадь кольца по диаметру:"+geomCalc.ringareaDiametr(8,1));
        System.out.println("Периметр треугольника:"+geomCalc.perimetrTriangle(8,1,6));
        System.out.println("Площадь треугольника:"+geomCalc.areaTriangle(2,3));
        System.out.println("Периметр прямоугольника:"+geomCalc.perimetrRectangle(7,3));
        System.out.println("Площадь прямоугольника:"+geomCalc.areaReactangle(10,15));
    }
}
