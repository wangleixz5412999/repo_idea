package com.lagou.dao;

import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseContentMapper {
    /*
    查询课程下的章节信息和课时信息
     */
    public List<CourseSection> findSectionAndLessonByCourseId(Integer courseId);
}
