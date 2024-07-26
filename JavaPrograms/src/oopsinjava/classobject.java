package oopsinjava;

import java.util.Scanner;

public class classobject {
    public static void main(String[] args){
//        print the trainer name,
//            Trainer trainerName= new trainerName();
//            Trainer.trainerName= "Satyam";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        Student.studentName =sc.nextLine();
        System.out.println("enter your technology");
        Student.studentEnrolledTechnology =sc.nextLine();
        System.out.println(Student.studentName+" this is my enrolled  " + Student.studentEnrolledTechnology);
    }
}
class Trainer {
    String trainerName;
    String trainertechnology;
}
//    int noofHoursComplete
class Student{
    static String studentName;
    static  String studentEnrolledTechnology;
}
