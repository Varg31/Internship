package main;

import java.util.*;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.Teacher;

public class Application {
    public static void main(String[] args) {
        University university = new University("Lviv National University");
        
        List<String> nameList = new ArrayList(); // вхідний список імен
        nameList.add("Andrew Kostenko");         
        nameList.add("Julia Veselkina");
        nameList.add("Maria Perechrest");
        nameList.add("Ivan Ivanov");
        nameList.add("Jason Statham");
        
        List<Teacher> teacherList = new ArrayList(); // вхідний список імен
        teacherList.add(new Teacher("Andrew Kostenko"));         
        teacherList.add(new Teacher("Julia Veselkina"));
        teacherList.add(new Teacher("Maria Perechrest"));
        teacherList.add(new Teacher("Ivan Ivanov"));
        teacherList.add(new Teacher("Jason Statham"));
        
        
        
        university.setTeacher(new Teacher("Some Name"));
        
        /*  Цикли можна виділити в окремий метод при бажанні, 
            або створити клас який би займався створенням списку студентів
        */
        List<Student> studentsList = new ArrayList();
        nameList.forEach((name) -> {
            studentsList.add(new Student(name));
        }); 
        
        studentsList.forEach((student) -> { // можна було б передавати одразу список, 
            university.addStudent(student); // але потрібен додатковий цикл в addStudent()
        }); 
        
        System.out.println("Best students are: ");
        for (Student s : university.findStudentsWithSomeLevel(3)) {
            System.out.println(s.toString());
        }

        /*Internship internship = new Internship("Interlink");
        
        internship.addCandidates(university.getStudents());

        System.out.println("List of internship's students:");
        for (Student s: internship.getStudents())
        System.out.print(s.getName() + "  ");*/
    }
}
