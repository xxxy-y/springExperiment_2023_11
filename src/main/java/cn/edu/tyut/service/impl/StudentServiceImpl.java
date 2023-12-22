package cn.edu.tyut.service.impl;

import cn.edu.tyut.dao.StudentDao;
import cn.edu.tyut.entity.Student;
import cn.edu.tyut.service.StudentService;
import jakarta.annotation.Resource;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 羊羊
 * @ClassName StudentServiceImpl
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 10:41
 * @Package_Name cn.edu.tyut.service.impl
 */
@Setter
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /**
     * >>
     */
    @Override
    public void addStudent() {
        studentDao.addStudent();
    }

    /**
     * >
     */
    @Override
    public void deleteStudent() {
        studentDao.deleteStudent();
    }

    /**
     * @param student >
     */
    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }
}
