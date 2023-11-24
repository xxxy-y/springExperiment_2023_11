import cn.edu.tyut.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 羊羊
 * @ClassName test
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 11:22
 * @Package_Name PACKAGE_NAME
 */
public class testt {
    @Test
    void a() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.addStudent();
        studentService.deleteStudent();
    }
}