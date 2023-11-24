package cn.edu.tyut.service;

import cn.edu.tyut.entity.Student;

/**
 * @Author 羊羊
 * @ClassName StudentService
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 10:41
 * @Package_Name cn.edu.tyut.service
 */
public interface StudentService {
    /**
     * >>
     */
    void addStudent();

    /**
     * >
     */
    void deleteStudent();

    /**
     * >>
     *
     * @param student >>
     */
    void saveStudent(Student student);
}
