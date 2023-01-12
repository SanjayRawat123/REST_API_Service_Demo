/*
 * Author Name:
 * Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package web34com.example.restFulServicedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web34com.example.restFulServicedemo.domain.Student;
import web34com.example.restFulServicedemo.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    private StudentRepository studentRepository;
@Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStudent(int sId) {

    studentRepository.deleteById(sId);
    return true;
    }

    @Override
    public List<Student> fetchAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }
}
