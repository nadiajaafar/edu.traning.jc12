package jc.edu.traning.lesson12;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student("Соколов В.А.", 105, new int[]{9, 9, 9, 10, 9,});
        students[1] = new Student("Васькин И.К.", 106, new int[]{9, 10, 9, 9, 10});
        students[2] = new Student("Черёткин Г.В.", 106, new int[]{7, 8, 5, 1, 8});
        students[3] = new Student("Игорчик Д.Г", 105, new int[]{6, 10, 5, 9, 7});
        students[4] = new Student("Шалыжин Л.А.", 105, new int[]{9, 5, 9, 8, 7});
        students[5] = new Student("Соколов В.А.", 105, new int[]{9, 9, 9, 10, 9});
        students[6] = new Student("Иванов И.И.", 101, new int[]{9, 9, 10, 10, 9});
        students[7] = new Student("Петров П.П.", 102, new int[]{8, 9, 10, 9, 10});
        students[8] = new Student("Сидоров С.С.", 101, new int[]{10, 10, 10, 10, 10});
        students[9] = new Student("Козлова А.Н.", 103, new int[]{9, 9, 9, 9, 9});


        for (Student student: students){
            student.printHighGradesInfo();
        }

    }


}

