package cn.edu.tyut.dao;

import cn.edu.tyut.entity.Student;

/**
 * @Author 羊羊
 * @ClassName StudentDao
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 10:42
 * @Package_Name cn.edu.tyut.dao
 */
public interface StudentDao {
    /**
     * >>
     */
    void addStudent();

    /**
     * >>
     */
    void deleteStudent();

    /**
     * >
     *
     * @param student >
     */
    void saveStudent(Student student);
}
