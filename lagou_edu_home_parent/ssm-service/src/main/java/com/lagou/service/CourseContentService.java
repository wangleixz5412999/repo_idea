package com.lagou.service;

import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseContentService {

    /*
    根据id查询课程的章节和课时信息
     */
    public List<CourseSection> findSectionAndLessonByCourseId(Integer courseId);
}
