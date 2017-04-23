package com.mac.Dao;

import com.mac.Entity.Student;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;


@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "s1", "comp"));
                put(2, new Student(2, "s2", "it"));
                put(3, new Student(3, "s3", "management"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }
    public void deleteStudentById(int id){
        this.students.remove(id);
    }

    public void addStudent(int id){
        this.students.remove(id);
    }
}
