package com.codegnan.searching.sorting;

public class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }              

    public void display() {
        System.out.println(name + " - " + marks);
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;  
    }
}