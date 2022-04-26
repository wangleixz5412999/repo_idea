package com.lagou.service.impl;

import com.lagou.dao.CourseContentMapper;
import com.lagou.domain.CourseSection;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-25-07:54
 * @Description:
 */
@Service
public class CourseContentServiceImpl implements CourseContentService {

    @Autowired
    private CourseContentMapper courseContentMapper;
    @Override
    public List<CourseSection> findSectionAndLessonByCourseId(Integer courseId) {
        List<CourseSection> sectionAndLessonByCourseId = courseContentMapper.findSectionAndLessonByCourseId(courseId);
        return sectionAndLessonByCourseId;
    }
}
