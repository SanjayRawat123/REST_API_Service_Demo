package web34com.example.restFulServicedemo.service;

import web34com.example.restFulServicedemo.domain.Student;

import java.util.List;
public interface IStudentService {

Student saveStudent(Student student);
boolean deleteStudent(int sId);
List<Student>fetchAllStudent();


}
