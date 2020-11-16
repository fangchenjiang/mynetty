package cn.xfnihao;

import static org.junit.Assert.assertTrue;

import cn.xfnihao.entity.Student;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        Student student = new Student();
        student.setName("xf");
        if (student.getList()==null){
            System.out.println("null");
        }
    }
}
