package institution;

import java.util.*;
import person.*;

public class University {
    private final String name;
    private final List<Student> studentList;
    private List<Teacher> teacherList;
    private Teacher teacher;
    
    public University(String name) {
        this.name = name;
        
        studentList = new ArrayList();
        teacherList = new ArrayList();
    }

    public void setStudent(Student student) {
        studentList.add(student);
    }
    
    public List<Student> getStudents() {
        return studentList;
    }

    public List<Teacher> getTeachers() {
        return teacherList;
    }
    
    public void setTeacher(List<Teacher> teacher) {
        teacherList = teacher;
    }
    
    public void setTeacher(Teacher t) {
        this.teacher = t;
    }
    
    public void addStudent(Student student) { 
        studing(student);
        System.out.println(student.getName() + ": " + student.getLevel());
        studentList.add(student);
    }
    
    private void studing(Student s) {
        s.setKnowledge(teacher.teach());
        //System.out.println("Mark: " + s.getLevel());    
    }
    
    public List<Student> findStudentsWithSomeLevel(int level) {
        List<Student> result = new LinkedList();
        studentList.stream().filter((s) -> (s.getLevel() > level)).
                forEachOrdered((s) -> { result.add(s); }); 
        return result;
    }
}
