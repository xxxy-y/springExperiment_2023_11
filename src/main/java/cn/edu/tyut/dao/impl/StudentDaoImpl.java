package cn.edu.tyut.dao.impl;

import cn.edu.tyut.dao.StudentDao;
import cn.edu.tyut.entity.Student;

/**
 * @Author 羊羊
 * @ClassName StudentDaoImpl
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 10:42
 * @Package_Name cn.edu.tyut.dao.impl
 */
public class StudentDaoImpl implements StudentDao {
    /**
     * >>
     */
    @Override
    public void addStudent() {
        System.out.println("add student ...");
    }

    /**
     * >>
     */
    @Override
    public void deleteStudent() {
        System.out.println("delete student ...");
    }

    /**
     * >
     *
     * @param student >
     */
    @Override
    public void saveStudent(Student student) {
        System.out.println("访问数据库, 实现保存学生的信息");
    }
}
