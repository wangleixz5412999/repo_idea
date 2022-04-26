package com.lagou.dao;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;

import java.util.List;

public interface CourseMapper {
    /*
    多条件列表查询
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);
    /*
    保存课程信息
     */
    public int saveCourse(Course course);

    /*
    保存讲师信息
     */
    public int saveTeacher(Teacher teacher);
}
