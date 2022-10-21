package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Subject extends SIF {
    Student[] students;
    String name;
    double highestNote;
    double lowestNote;
    double promedy;

    public Subject(){}

    public Subject(Student[] students, String name, double highestNote, double lowestNote, double promedy) {
        this.students = students;
        this.name = name;
        this.highestNote = highestNote;
        this.lowestNote = lowestNote;
        this.promedy = promedy;
    }

    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHighestNote() {
        return highestNote;
    }
    public void setHighestNote(double highestNote) { this.highestNote = highestNote;
    }
    public double getLowestNote() {
        return lowestNote;
    }
    public void setLowestNote(double lowestNote) {
        this.lowestNote = lowestNote;
    }
    public double getPromedy() {
        return promedy;
    }
    public void setPromedy(double promedy) {
        this.promedy = promedy;
    }

    public void addStudent(int index, SIF sif) {
        System.out.println("Now adding students to " + sif.subjects[index].getName());
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many students are to be added?");
        sif.subjects[index].students = new Student[keyboard.nextInt()];
        for (int i = 0; i < sif.subjects[index].students.length; i++) {
            sif.subjects[index].students[i] = new Student();
            System.out.println("Input the name of the student " + (i+1));
            sif.subjects[index].students[i].setName(keyboard.next());
            System.out.println("Input the final note of said student");
            sif.subjects[index].students[i].setNote(keyboard.nextDouble());
        }
    }

    public void seeStudents(int index, SIF sif) {
        System.out.println("Students from " + sif.subjects[index].getName());
        for (int i = 0; i < sif.subjects[index].students.length; i++) {
            System.out.println((i + 1) + ". " + sif.subjects[index].students[i].toString() + "\n");
        }
    }

    public void getHighestLowestNPromedy(int index, SIF sif) {
        double tempHig = sif.subjects[index].students[0].getNote();
        double tempLow = sif.subjects[index].students[0].getNote();
        double tempPro = 0;
        for (int i = 0; i < sif.subjects[index].students.length; i++) {
            tempPro += sif.subjects[index].students[i].getNote();
            if (sif.subjects[index].students[i].getNote() > tempHig) {
                tempHig = sif.subjects[index].students[i].getNote();
            }
            if (sif.subjects[index].students[i].getNote() < tempLow) {
                tempLow = sif.subjects[index].students[i].getNote();
            }
        }
        setHighestNote(tempHig);
        setLowestNote(tempLow);
        setPromedy(tempPro/sif.subjects[index].students.length);
    }

    public void quicksort(int[] v, int left, int right) {
        int pivot = v[0];
        int i = left;
        int j = right;
        int temp;
        while(i < j){
            while(v[i] <= pivot && i < j)
                i++;
            while(v[j] > pivot)
                j--;
            if (i < j) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        v[left] = v[j];
        v[j] = pivot;
        if(left < j - 1)
            quicksort(v,left,j - 1);
        if(j + 1 < right)
            quicksort(v,j + 1,right);
    }

    public String toUseString(int index, SIF sif) {
        return  "students = " + Arrays.toString(students) +
                "\nName = " + name +
                "\nHighestNote = " + highestNote +
                "\nLowestNote = " + lowestNote +
                "\nAverage = " + promedy +
                "\nStudents: " + sif.subjects[index].students.toString();
    }
}
