package com.company;

import java.lang.reflect.Array;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(12, "Olamilec", 17, 98.2);
        Student student3 = new Student(1, "Kola", 13, 83.6);

        System.out.println("Student One (1)");
        System.out.println("------------------------------");
        System.out.println("Roll Number: " + student1.roll_num);
        System.out.println("Age: " + student1.age);
        System.out.println("Name: " + student1.name);
        System.out.println("Marks: " + student1.marks);

        System.out.println("*******************************");

        System.out.println("Student Two (2)");
        System.out.println("------------------------------");
        System.out.println("Roll Number: " + student2.roll_num);
        System.out.println("Age: " + student2.age);
        System.out.println("Name: " + student2.name);
        System.out.println("Marks: " + student2.marks);

        System.out.println("*******************************");

        System.out.println("Student Three (3)");
        System.out.println("------------------------------");
        System.out.println("Roll Number: " + student3.roll_num);
        System.out.println("Age: " + student3.age);
        System.out.println("Name: " + student3.name);
        System.out.println("Marks: " + student3.marks);


    }
    public static class Student{
        int roll_num;
        String name;
        int age;
        double marks;

        public Student(int roll_num, String name, int age, double marks) {
            this.roll_num = roll_num;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
        public Student(){
            this.roll_num = 18;
            this.name = "Ojuelegba";
            this.age = 19;
            this.marks = 89.9;
        }
    }
}
