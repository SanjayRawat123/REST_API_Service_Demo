/*
 * Author Name:
 * Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package web34com.example.restFulServicedemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web34com.example.restFulServicedemo.domain.Student;

@Repository
public  interface StudentRepository extends CrudRepository<Student, Integer> {


}
