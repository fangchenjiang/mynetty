package cn.xfnihao.entity;

import lombok.Data;


import java.util.List;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/12
 */
@Data
public class Student  {


    private  Integer id;

    private String  name;

    private List<String>list;
}
