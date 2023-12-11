package jc.edu.traning.lesson12;

public class Student {


    private String surname;
    private String initials;
    private int groupNumber;

    private int[] grade = new int[5];

    public Student(String initials, int groupNumber, int[] grade) {
        setInitials(initials);
        setGroupNumber(groupNumber);
        setGrade(grade);

    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getGrade() {
        return grade;
    }

    public boolean checkGrades() {
        for (int grade : getGrade()) {
            if (grade != 9 && grade != 10) {
                return false;
            }
        }

        return true;
    }


    public void printHighGradesInfo() {
        if (checkGrades()) {
            System.out.print("Фамилия: " + getInitials() + " группа: " + getGroupNumber() + " успеваемость: ");
            for (int grade : getGrade()) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
    }


}