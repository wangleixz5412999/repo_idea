package com.lagou.domain;

/**
 * @author:wanglei
 * @create:2022-04-24-07:26
 * @Description:前台传递的参数实体类
 */
public class CourseVO {
    /*
    课程名称
     */
    private String courseName;

    /*
    课程状态
     */
    private Integer status;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
