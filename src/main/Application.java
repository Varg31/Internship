package main;

import java.util.*;
import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("Lviv National University");
        
        List<String> nameList = new ArrayList(); // вхідний список імен
        nameList.add("Andrew Kostenko");         
        nameList.add("Julia Veselkina");
        nameList.add("Maria Perechrest");
        nameList.add("Ivan Ivanov");
        nameList.add("Jason Statham");
        
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

        Internship internship = new Internship("Interlink");
        
        internship.addCandidates(university.getStudents());

        System.out.println("List of internship's students:");
        for (Student s: internship.getStudents())
        System.out.print(s.getName() + "  ");
    }
}
