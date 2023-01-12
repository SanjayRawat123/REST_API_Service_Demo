/*
 * Author Name:
 * Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package web34com.example.restFulServicedemo.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web34com.example.restFulServicedemo.domain.Student;
import web34com.example.restFulServicedemo.service.IStudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private IStudentService iStudentService;
@Autowired
    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @PostMapping("/insetstudent")
    public ResponseEntity<?>saveFunction(@RequestBody Student studentObj){
    return new ResponseEntity<>(iStudentService.saveStudent(studentObj),HttpStatus.CREATED);
    }

    @GetMapping("/fetchallstudent")
    public ResponseEntity<?>fetchallFunction(){
    return new ResponseEntity<>(iStudentService.fetchAllStudent(),HttpStatus.OK);

    }



}
