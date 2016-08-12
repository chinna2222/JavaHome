package OOP.TaskNumberOne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex on 10.08.2016.
 */
public class Student {
    private String name;
    private String surname ;
    private String patronymic;
    private String address ;
    private String day;
    private String month;
    private String year;
    private int telephone;
    private String faculty;
    private String group;
    private String courses;
    private static Student [] st = new Student[10];
    private static int size = 0;

    public Student() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.patronymic = "Unknown";
        this.address = "Unknown";
        this.day = "Unknown";
        this.month = "Unknown";
        this.year = "Unknown";
        this.telephone = 0;
        this.faculty = "Unknown";
        this.group = "Unknown";
        this.courses = "Unknown";
    }

    public Student(String name, String surname, String patronymic, String address, String day, String month, String year, int telephone, String faculty, String group, String courses) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.day = day;
        this.month = month;
        this.year = year;
        this.telephone = telephone;
        this.faculty = faculty;
        this.group = group;
        this.courses = courses;
        addStudent(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", telephone=" + telephone +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }
    //Добовляем студентов в массив
    private static void addStudent(Student student){
        if(size <= st.length-1){
            st[size++] = student;
        }
    }
    //Выводим всех студентов
    public static void printStudent(){
        for(int i = 0 ; i < size; i++){
            System.out.println(st[i]);
        }
        System.out.println("");
    }
    //Выводим всех студентов по факультету
    public static void printFaculty(String faculty){
        String nonfaculty = "";
        for(int i = 0 ; i < size; i++){
            if(st[i].faculty.equals(faculty)){
                System.out.println(st[i]);
            }
        }
    }
    //Выводим всех студентов по факультету и курсу
    public static void printfacultyandCourses(String faculty ,String courses){
        for(int i = 0 ; i < size; i++) {
            if (st[i].faculty.equals(faculty) && st[i].courses.equals(courses)) {
                System.out.println(st[i]);
            }
        }
    }
    //Выводим всех студентов родившихся после определенного года
    public static void printfromDate(String year) throws ParseException {
        SimpleDateFormat sp = new SimpleDateFormat("yyyy");
        Date date = new Date();
        date = sp.parse(year);
        for(int i = 0 ; i < size ;i++){
            Date datestudent = new Date();
            datestudent = sp.parse(st[i].year);
            if(datestudent.after(date)){
                System.out.println(st[i]);
            }
        }
    }
    //Выводим всех студентов по группе
    public static void printGroup(String group){
        for(int i = 0 ; i < size; i++) {
            if (st[i].group.equals(group)) {
                System.out.println(st[i]);
            }
        }
    }
    public String getCourses() {
        return courses;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getDay() {

        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
