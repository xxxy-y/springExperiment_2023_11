package cn.edu.tyut.controller;

import cn.edu.tyut.entity.Student;
import cn.edu.tyut.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 羊羊
 * @ClassName StudentController
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 10:41
 * @Package_Name cn.edu.tyut.controller
 */
public class StudentController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        Student student = new Student();
        student.setId(1);
        student.setName("ww");
        student.setAddress("wuHan");
        student.setAge(20);
        student.setNumber(200);
        student.setGender("second");
        student.setStatus(2);
        studentService.saveStudent(student);
    }
}
