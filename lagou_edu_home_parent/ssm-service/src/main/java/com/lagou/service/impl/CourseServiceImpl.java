package com.lagou.service.impl;

import com.lagou.dao.CourseMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-24-07:40
 * @Description:课程service
 */
@Service
public class CourseServiceImpl implements CourseService {
    /*
    多条件查询
     */
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> findCourseByCondition(CourseVO courseVO) {
        List<Course> courseByCondition = courseMapper.findCourseByCondition(courseVO);
        return courseByCondition;
    }

    /*
    保存课程信息
     */
    @Override
    public int saveCourse(Course course) {
        int i = courseMapper.saveCourse(course);
        return i;
    }
    /*
    保存讲师信息
     */
    @Override
    public int saveTeacher(Teacher teacher) {
        return 0;
    }


}
